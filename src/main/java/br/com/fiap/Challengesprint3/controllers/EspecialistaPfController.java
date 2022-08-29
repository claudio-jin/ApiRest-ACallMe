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

import br.com.fiap.Challengesprint3.models.EspecialistaPf;
import br.com.fiap.Challengesprint3.services.EspecialistaPfService;

@RestController
@RequestMapping("/api/especialistaPf")
public class EspecialistaPfController {

	@Autowired
	private EspecialistaPfService service;
	
	
	@PostMapping
	@Transactional
	public ResponseEntity<EspecialistaPf> create(@RequestBody @Valid EspecialistaPf especialistaPf) {
		service.save(especialistaPf);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(especialistaPf);
	}
	
	@GetMapping
    public List<EspecialistaPf> index() {
        return service.listAll();
    }
	
}
