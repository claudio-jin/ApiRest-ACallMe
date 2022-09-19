package br.com.fiap.Challengesprint3.dto.EnderecoDtos;

import br.com.fiap.Challengesprint3.models.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;

//listagem de endereço dto
@Data
@AllArgsConstructor
public class EnderecoDto {

    private int cep;
	
	private String nomeRua;

	private int numeroRua;

	private String complemento;

    private String nomeBairro;
    
    private String nomeCidade;

	private String sigla;

    private String nomeEstado;

	private String siglaEstado;

    public EnderecoDto() {

	}

	public EnderecoDto(Endereco endereco) {
		this.cep = endereco.getCep();
		this.nomeRua = endereco.getNomeRua();
		this.complemento = endereco.getComplemento();
		this.nomeBairro = endereco.getBairro().getNomeBairro();
		this.nomeCidade = endereco.getBairro().getCidade().getNomeCidade();
		this.sigla = endereco.getBairro().getCidade().getSigla();
		this.nomeEstado = endereco.getBairro().getCidade().getEstado().getNomeEstado();
		this.siglaEstado = endereco.getBairro().getCidade().getEstado().getSiglaEstado();

	}

}
