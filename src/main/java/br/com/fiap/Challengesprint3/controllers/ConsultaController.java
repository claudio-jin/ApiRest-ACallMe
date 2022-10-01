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

import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDto;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDtoEspecialistaPf;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaDtoEspecialistaPj;
import br.com.fiap.Challengesprint3.dto.ConsultaDtos.ConsultaProntuarioDto;
import br.com.fiap.Challengesprint3.models.Consulta;
import br.com.fiap.Challengesprint3.service.ConsultaService;

@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {
    
    @Autowired
    ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> create(@RequestBody @Valid Consulta consulta) {
        consultaService.save(consulta);
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(consulta);
    }

    @GetMapping
    public List<Consulta> getConsulta() {
        return consultaService.listAll();
    }

    @PutMapping("{id}")
    public ResponseEntity<Consulta> updateConsulta(@PathVariable Long id, @RequestBody @Valid Consulta novaConsulta) {
        var optional = consultaService.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

        var consulta = optional.get();
        BeanUtils.copyProperties(novaConsulta, consulta);
        consulta.setCodConsulta(id);

        consultaService.save(consulta);
        return ResponseEntity.ok(consulta);
    }

    @GetMapping("{id}")
    public ResponseEntity<Consulta> getConsultaById(@PathVariable Long id){
        return ResponseEntity.of(consultaService.getById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteConsultaById(@PathVariable Long id){
        var optional = consultaService.getById(id);

        if(optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

    	consultaService.remove(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/consultaDto") 
    public List<ConsultaDto> getConsultaDto() {
        return consultaService.getConsultaDto();
    }

    @GetMapping("/consultaDtoEspecialistaPf")
    public List<ConsultaDtoEspecialistaPf> getConsultaDtoEspecialistaPf() {
        return consultaService.getConsultaDtoEspecialistaPf();
    }

    @GetMapping("/consultaDtoEspecialistaPj")
    public List<ConsultaDtoEspecialistaPj> getConsultaDtoEspecialistaPj() {
        return consultaService.getConsultaDtoEspecialistaPj();
    }

    @GetMapping("/consultaProntuarioDto")
    public List<ConsultaProntuarioDto> getConsultaProntuarioDto() {
        return consultaService.getConsultaProntuarioDto();
    }
}
