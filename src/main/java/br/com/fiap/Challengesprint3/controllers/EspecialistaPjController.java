package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

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

import br.com.fiap.Challengesprint3.models.EspecialistaPj;
import br.com.fiap.Challengesprint3.service.EspecialistaPjService;

@RestController
@RequestMapping("/api/especialistaPj")
public class EspecialistaPjController {

	@Autowired
	EspecialistaPjService service;
	
	//cadastro
	@PostMapping
	public ResponseEntity<EspecialistaPj> create(@RequestBody @Valid EspecialistaPj especialistaPj) {
		service.save(especialistaPj);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(especialistaPj);
	}
	
	//listagem
	@GetMapping
    public List<EspecialistaPj> index() {
        return service.listAll();
    }

	//atualização
	@PutMapping("{id}")
    public ResponseEntity<EspecialistaPj> updatePacienteById(@PathVariable Long id, @RequestBody @Valid EspecialistaPj novoEspecialistaPj){
        var optional = service.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
        var especialistaPj = optional.get();
        BeanUtils.copyProperties(novoEspecialistaPj, especialistaPj);
        especialistaPj.setId(id);

        service.save(especialistaPj);
        return ResponseEntity.ok(especialistaPj);
    }


	//listagem de um especialistaPj pelo id
	@GetMapping("{id}")
    public ResponseEntity<EspecialistaPj> getEspecialistaPjById(@PathVariable Long id){
        return ResponseEntity.of(service.getById(id));
    }

	//Remoção de especialistapj pelo id
	@DeleteMapping("{id}")
    public ResponseEntity<Object> deleteEspecialistaPjById(@PathVariable Long id){
        var optional = service.getById(id);

        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

    	service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

	
}
