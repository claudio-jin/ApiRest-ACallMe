package br.com.fiap.Challengesprint3.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.Challengesprint3.dto.PacienteDtos.PacienteConsultasDto;
import br.com.fiap.Challengesprint3.dto.PacienteDtos.PacienteConsultasProntuarioDto;
import br.com.fiap.Challengesprint3.dto.PacienteDtos.PacienteDtoComId;
import br.com.fiap.Challengesprint3.models.Paciente;
import br.com.fiap.Challengesprint3.repository.PacienteRepository;

@Transactional
@Service
public class PacienteService {

	@Autowired
	PacienteRepository repository;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	public List<Paciente> listAll() {
		return repository.findAll();
	}
	
	@Transactional
	public void save(Paciente paciente) {
		paciente.setPassword(passwordEncoder.encode(paciente.getPassword()));
		repository.save(paciente);
	}
	
	public void remove(Long id) {
        repository.deleteById(id);
    }

	public Optional<Paciente> getById(Long id) {
        return repository.findById(id);
    }

	public List<PacienteConsultasDto> getPacienteConsultaEspecialista() {
		List<Paciente> pacientes = repository.findAll();
		List<PacienteConsultasDto> dto = pacientes.stream().map(p -> new PacienteConsultasDto(p)).collect(Collectors.toList()); 
		return dto;
	}

	public List<PacienteConsultasProntuarioDto> getPacienteConsultaProntuarioDto() {
		List<Paciente> pacientes = repository.findAll();
		return pacientes.stream().map(p -> new PacienteConsultasProntuarioDto(p)).collect(Collectors.toList());
	}

	public List<Paciente> login(String email, String password) {
		return repository.findByEmailAndPassword(email, password);
	}

	public List<PacienteDtoComId> getPacienteComId() {
		List<Paciente> pacientes = repository.findAll();
		List<PacienteDtoComId> dto = pacientes.stream().map(p -> new PacienteDtoComId(p)).collect(Collectors.toList()); 
		return dto;
	}

	//Variação para criçao de um paciente
	// public Paciente execute(Paciente paciente) {
	// 	Paciente existPaciente = repository.findByUsername(paciente.getUsername());

	// 	if(existPaciente != null) {
	// 		throw new Error("User already exist");
	// 	}
	// 	Paciente createPaciente = repository.save(paciente);

	// 	return createPaciente;
	// }
}
