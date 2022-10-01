package br.com.fiap.Challengesprint3.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.Challengesprint3.dto.EnderecoDtos.EnderecoDto;
import br.com.fiap.Challengesprint3.models.Endereco;
import br.com.fiap.Challengesprint3.service.EnderecoService;

//classe teste de endereco
@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @Transactional
    public ResponseEntity<Endereco> create(@RequestBody @Valid Endereco endereco) {
        enderecoService.save(endereco);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(endereco);
    }

    @GetMapping
    public List<Endereco> index() {
        return enderecoService.listAll();
    }

    // @GetMapping("/enderecoDto")
    // public List<EnderecoDto> getEnderecoDto() {
    //     return enderecoService.listEnderecoDto();
    // }


    @GetMapping("/enderecoDto")
    public List<EnderecoDto> getEnderecoDto() {
        List<Endereco> enderecos = enderecoService.listAll();
        List<EnderecoDto> enderecoDto = enderecos.stream().map(endereco -> new EnderecoDto(endereco)).collect(Collectors.toList());

        return enderecoDto;
    }

    @PutMapping("{id}")
    public ResponseEntity<Endereco> updateEnderecoById(@PathVariable Long id, @RequestBody @Valid Endereco novoEndereco){
        var optional = enderecoService.getById(id);

        if(optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
        var endereco = optional.get();
        BeanUtils.copyProperties(novoEndereco, endereco);
        endereco.setId(id);

        enderecoService.save(endereco);
        return ResponseEntity.ok(endereco);
    }


}
