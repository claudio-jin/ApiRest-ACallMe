package br.com.fiap.Challengesprint3.dto.roles;

import java.util.List;

public class CreateUserRoleDto {
    private Long idUser;
    
    private List<Long> idsRoles;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public List<Long> getIdsRoles() {
        return idsRoles;
    }

    public void setIdsRoles(List<Long> idsRoles) {
        this.idsRoles = idsRoles;
    }

    
}
