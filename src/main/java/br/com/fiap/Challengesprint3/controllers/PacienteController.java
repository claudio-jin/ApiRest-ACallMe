package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.services.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

	@Autowired
	PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<Paciente> create(@RequestBody @Valid Paciente paciente) {
		pacienteService.save(paciente);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(paciente);
	}
	
	@GetMapping
	public List<Paciente> getPaciente(){
		return pacienteService.listAll();
	}
}
