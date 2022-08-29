package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.models.EspecialistaPj;
import br.com.fiap.Challengesprint3.services.EspecialistaPjService;

@RestController
@RequestMapping("/api/especialistaPj")
public class EspecialistaPjController {

	@Autowired
	EspecialistaPjService service;
	
	@PostMapping
	@Transactional
	public ResponseEntity<EspecialistaPj> create(@RequestBody @Valid EspecialistaPj especialistaPj) {
		service.save(especialistaPj);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(especialistaPj);
	}
	
	@GetMapping
    public List<EspecialistaPj> index() {
        return service.listAll();
    }
	
}
