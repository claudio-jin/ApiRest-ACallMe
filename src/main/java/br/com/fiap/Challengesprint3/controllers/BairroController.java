package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.models.Bairro;
import br.com.fiap.Challengesprint3.services.BairroService;

@RestController
@RequestMapping("/api/bairro")
public class BairroController {

    @Autowired
    private BairroService service;

    @PostMapping
    public ResponseEntity<Bairro> create (@RequestBody @Valid Bairro bairro) {
        service.save(bairro);
        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(bairro);
    }

    @GetMapping
    public List<Bairro> index() {
        return service.listAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Bairro> show(@PathVariable Long id){
        return ResponseEntity.of(service.getById(id));
    }
}

