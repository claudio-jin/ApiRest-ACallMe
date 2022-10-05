package br.com.fiap.Challengesprint3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.Challengesprint3.models.RoleModel;
import br.com.fiap.Challengesprint3.repository.RoleRepository;

@Configuration
public class DataBaseSeed implements CommandLineRunner{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        
        //Adicionando roles no banco
        roleRepository.save(new RoleModel("ROLE_USER"));
        roleRepository.save(new RoleModel("ROLE_ADMIN"));
        roleRepository.save(new RoleModel("ROLE_ESPEC"));

        

    }
    
}
