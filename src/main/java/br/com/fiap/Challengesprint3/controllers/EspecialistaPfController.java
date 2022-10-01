package br.com.fiap.Challengesprint3.controllers;

import java.util.List;

import javax.transaction.Transactional;
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

import br.com.fiap.Challengesprint3.dto.EspecialistaPfDtos.EspecialistaPfDto;
import br.com.fiap.Challengesprint3.models.EspecialistaPf;
import br.com.fiap.Challengesprint3.service.EspecialistaPfService;

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

    @GetMapping("/especialistaPfDto")
    public List<EspecialistaPfDto> getEspecialistaPfDto() {
        return service.getEspecialistaPfDto();
    }

	
	@PutMapping("{id}")
    public ResponseEntity<EspecialistaPf> updatePacienteById(@PathVariable Long id, @RequestBody @Valid EspecialistaPf novoEspecialistaPf){
        var optional = service.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
        var especialistaPf = optional.get();
        BeanUtils.copyProperties(novoEspecialistaPf, especialistaPf);
        especialistaPf.setCodEspecialista(id);

        service.save(especialistaPf);
        return ResponseEntity.ok(especialistaPf);
    }


	@GetMapping("{id}")
    public ResponseEntity<EspecialistaPf> getEspecialistaPfById(@PathVariable Long id){
        return ResponseEntity.of(service.getById(id));
    }

	//Remoção de especialistapf pelo id
	@DeleteMapping("{id}")
    public ResponseEntity<Object> deleteEspecialistaPfById(@PathVariable Long id){
        var optional = service.getById(id);

        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

    	service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
