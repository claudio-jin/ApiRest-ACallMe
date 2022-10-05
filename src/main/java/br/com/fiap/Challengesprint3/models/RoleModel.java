package br.com.fiap.Challengesprint3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class RoleModel implements GrantedAuthority{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    // @Column(nullable = false, unique = true)
    private String roleName;

    // @Enumerated(EnumType.STRING)
    // // @Column(nullable = false, unique = true)
    // private RoleName roleName;

    public RoleModel() {

    }

    public RoleModel(Long roleId) {
        this.roleId = roleId;
    }

    public RoleModel(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public RoleModel(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return this.roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }    
}
