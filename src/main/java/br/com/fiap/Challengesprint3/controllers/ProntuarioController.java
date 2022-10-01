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

import br.com.fiap.Challengesprint3.dto.ProntuarioDtos.ProntuarioDto;
import br.com.fiap.Challengesprint3.models.Prontuario;
import br.com.fiap.Challengesprint3.service.ProntuarioService;

@RestController
@RequestMapping("/api/prontuario")
public class ProntuarioController {

    @Autowired
    ProntuarioService service;

    @PostMapping
    public ResponseEntity<Prontuario> create(@RequestBody @Valid Prontuario Prontuario) {
        service.save(Prontuario);
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Prontuario);
    }

    @GetMapping
    public List<Prontuario> getProntuario() {
        return service.listAll();
    }


    //autenticar apenas para o especialista poder atualizar
    @PutMapping("{id}")
    public ResponseEntity<Prontuario> updateProntuario(@PathVariable Long id, @RequestBody @Valid Prontuario novoProntuario) {
        var optional = service.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

        var prontuario = optional.get();
        BeanUtils.copyProperties(novoProntuario, prontuario);
        prontuario.setCodProntuario(id);

        service.save(prontuario);
        return ResponseEntity.ok(prontuario);
    }

    @GetMapping("{id}")
    public ResponseEntity<Prontuario> getProntuarioById(@PathVariable Long id){
        return ResponseEntity.of(service.getById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteProntuarioById(@PathVariable Long id){
        var optional = service.getById(id);

        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

    	service.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/prontuarioDto")
    public List<ProntuarioDto> getProntuarioDto() {
        return service.getProntuarioDto();
    }
}
