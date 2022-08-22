package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.models.Endereco;
import br.com.fiap.Challengesprint3.services.EnderecoService;

@RestController
@RequestMapping
public class EnderecoController {
    
    @Autowired
    private EnderecoService service;

    @GetMapping
    public List<Endereco> index() {
        return service.listAll();
    }
}
