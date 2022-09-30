package br.com.fiap.Challengesprint3.dto.EnderecoDtos;

import br.com.fiap.Challengesprint3.models.Endereco;

//listagem de endereço dto
public class EnderecoDto {

	//endereco
    private Integer cep;
	
	private String nomeRua;

	private Integer numeroRua;

	private String complemento;

	//bairro
    private String nomeBairro;
    
	//cidade
    private String nomeCidade;

	private String sigla;

	//estado
    private String nomeEstado;

	private String siglaEstado;

    public EnderecoDto() {

	}

	public EnderecoDto(Endereco endereco) {
		this.cep = endereco.getCep();
		this.nomeRua = endereco.getNomeRua();
		this.numeroRua = endereco.getNumeroRua();
		this.complemento = endereco.getComplemento();
		this.nomeBairro = endereco.getBairro().getNomeBairro();
		this.nomeCidade = endereco.getBairro().getCidade().getNomeCidade();
		this.sigla = endereco.getBairro().getCidade().getSiglaCidade();
		this.nomeEstado = endereco.getBairro().getCidade().getEstado().getNomeEstado();
		this.siglaEstado = endereco.getBairro().getCidade().getEstado().getSiglaEstado();

	}

	public EnderecoDto(int cep, String nomeRua, int numeroRua, String complemento, String nomeBairro, String nomeCidade,
			String sigla, String nomeEstado, String siglaEstado) {
		this.cep = cep;
		this.nomeRua = nomeRua;
		this.numeroRua = numeroRua;
		this.complemento = complemento;
		this.nomeBairro = nomeBairro;
		this.nomeCidade = nomeCidade;
		this.sigla = sigla;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
	}

	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumeroRua() {
		return numeroRua;
	}

	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}


}
