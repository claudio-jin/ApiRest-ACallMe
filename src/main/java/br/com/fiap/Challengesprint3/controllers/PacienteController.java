package br.com.fiap.Challengesprint3.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.dto.PacienteDtos.PacienteConsultaEspecialistaDto;
import br.com.fiap.Challengesprint3.dto.PacienteDtos.PacienteDadosDto;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.services.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

	@Autowired
	PacienteService pacienteService;
	
	//Cadastro de paciente
	@PostMapping
	public ResponseEntity<Paciente> create(@RequestBody @Valid Paciente paciente) {
		pacienteService.save(paciente);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(paciente);
	}

	//Listagem de todos os pacientes
	@GetMapping
	public List<Paciente> getPacientes(){
		return pacienteService.listAll();
	}

	//Atualização de um paciente
	@PutMapping("{id}")
    public ResponseEntity<Paciente> updatePacienteById(@PathVariable Long id, @RequestBody @Valid Paciente novoPaciente){
		//Retorno optional paciente
        var optional = pacienteService.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
        var paciente = optional.get();
        BeanUtils.copyProperties(novoPaciente, paciente);
        paciente.setId(id);

        pacienteService.save(paciente);
        return ResponseEntity.ok(paciente);
    }

	//Listagem de paciente pelo id
	@GetMapping("{id}")
    public ResponseEntity<Paciente> getPacientById(@PathVariable Long id){
        return ResponseEntity.of(pacienteService.getById(id));
    }

	@GetMapping("/pacienteDto")
	public List<PacienteDadosDto> getPacienteDto() {
		List<Paciente> pacientes = pacienteService.listAll();
		List<PacienteDadosDto> dto = pacientes.stream().map(paciente -> new PacienteDadosDto(paciente)).collect(Collectors.toList());
		return dto;
	}

	//Remoção de paciente pelo id
	@DeleteMapping("{id}")
    public ResponseEntity<Object> deletePacienteById(@PathVariable Long id){
        var optional = pacienteService.getById(id);

        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

    	pacienteService.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

	@GetMapping("/pacienteConsultaEspecialistaDto")
	public List<PacienteConsultaEspecialistaDto> getPacienteConsultaEspecialistaDto() {
		return pacienteService.getPacienteConsultaEspecialista();
	}


}
