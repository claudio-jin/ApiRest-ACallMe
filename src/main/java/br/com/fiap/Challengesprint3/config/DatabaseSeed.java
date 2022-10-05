package br.com.fiap.Challengesprint3.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.enums.RoleName;
import br.com.fiap.Challengesprint3.models.RoleModel;
import br.com.fiap.Challengesprint3.repository.RoleRepository;

@Configuration
@Transactional
public class DatabaseSeed implements CommandLineRunner{

    @Autowired
    RoleRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new RoleModel(RoleName.ROLE_USER));
    }
    
}
