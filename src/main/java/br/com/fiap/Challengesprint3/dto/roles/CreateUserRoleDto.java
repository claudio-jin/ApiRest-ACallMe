package br.com.fiap.Challengesprint3.dto.roles;

import java.util.List;

public class CreateUserRoleDto {
    private Long id;
    
    private List<Long> idsRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getIdsRoles() {
        return idsRoles;
    }

    public void setIdsRoles(List<Long> idsRoles) {
        this.idsRoles = idsRoles;
    }

    
}
