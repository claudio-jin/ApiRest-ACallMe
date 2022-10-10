// package br.com.fiap.Challengesprint3.dto.EspecialistaPfDtos;

// import java.util.Date;

// import com.fasterxml.jackson.annotation.JsonFormat;

// import br.com.fiap.Challengesprint3.enums.EspecialistaTipo;
// import br.com.fiap.Challengesprint3.models.EspecialistaPf;

// public class EspecialistaPfDto {
// 	private Long codEspecialista;

// 	private String nomeEspecialista;

// 	private String email;

// 	@JsonFormat(pattern = "dd/MM/yyyy")
// 	private Date dtNascimento;

// 	private Integer telefoneDDD;

// 	private Integer telefone;

// 	private String descricaoSobre;

// 	private String tipoEspecialidade;

// 	private EspecialistaTipo tipo;

// 	// especialistaPf
// 	private Integer cpf;

// 	private Integer digitoCpf;

// 	// private Double valorConsulta; //verificar qual valor buscar para ser mapeado

// 	// genero
// 	private String genero;

// 	// endereco
// 	private Integer cep;

// 	private String nomeRua;

// 	private Integer numeroRua;

// 	private String complemento;

// 	// bairro
// 	private String nomeBairro;

// 	// cidade
// 	private String nomeCidade;

// 	private String sigla;

// 	// estado
// 	private String nomeEstado;

// 	private String siglaEstado;

// 	public EspecialistaPfDto(EspecialistaPf pf) {
// 		this.codEspecialista = pf.getCodEspecialista();
// 		this.nomeEspecialista = pf.getNomeEspecialista();
// 		this.email = pf.getEmail();
// 		this.dtNascimento = pf.getDtNascimento();
// 		this.telefoneDDD = pf.getTelefoneDDD();
// 		this.telefone = pf.getTelefone();
// 		this.descricaoSobre = pf.getDescricaoSobre();
// 		this.descricaoSobre = pf.getDescricaoSobre();
// 		this.tipoEspecialidade = pf.getTipoEspecialidade();
// 		this.tipo = pf.getTipo();
// 		this.cpf = pf.getCpf();
// 		this.digitoCpf = pf.getDigitoCpf();
// 		this.genero = pf.getGenero().getNomeGenero();
// 		// endereco
// 		this.cep = pf.getEndereco().getCep();
// 		this.nomeRua = pf.getEndereco().getNomeRua();
// 		this.numeroRua = pf.getEndereco().getNumeroRua();
// 		this.complemento = pf.getEndereco().getComplemento();
// 		this.nomeBairro = pf.getEndereco().getBairro().getNomeBairro();
// 		this.nomeCidade = pf.getEndereco().getBairro().getCidade().getNomeCidade();
// 		this.sigla = pf.getEndereco().getBairro().getCidade().getSiglaCidade();
// 		this.nomeEstado = pf.getEndereco().getBairro().getCidade().getEstado().getNomeEstado();
// 		this.siglaEstado = pf.getEndereco().getBairro().getCidade().getEstado().getSiglaEstado();

// 	}

// 	public EspecialistaPfDto(Long codEspecialista, String nomeEspecialista, String email, Date dtNascimento,
// 			Integer telefoneDDD, Integer telefone, String descricaoSobre, String tipoEspecialidade,
// 			EspecialistaTipo tipo, Integer cpf,
// 			Integer digitoCpf, String genero, Integer cep, String nomeRua, Integer numeroRua,
// 			String complemento, String nomeBairro, String nomeCidade, String sigla, String nomeEstado,
// 			String siglaEstado) {
// 		this.codEspecialista = codEspecialista;
// 		this.nomeEspecialista = nomeEspecialista;
// 		this.email = email;
// 		this.dtNascimento = dtNascimento;
// 		this.telefoneDDD = telefoneDDD;
// 		this.telefone = telefone;
// 		this.descricaoSobre = descricaoSobre;
// 		this.tipoEspecialidade = tipoEspecialidade;
// 		this.tipo = tipo;
// 		this.cpf = cpf;
// 		this.digitoCpf = digitoCpf;
// 		this.genero = genero;
// 		this.cep = cep;
// 		this.nomeRua = nomeRua;
// 		this.numeroRua = numeroRua;
// 		this.complemento = complemento;
// 		this.nomeBairro = nomeBairro;
// 		this.nomeCidade = nomeCidade;
// 		this.sigla = sigla;
// 		this.nomeEstado = nomeEstado;
// 		this.siglaEstado = siglaEstado;
// 	}

// 	public Long getCodEspecialista() {
// 		return codEspecialista;
// 	}

// 	public void setCodEspecialista(Long codEspecialista) {
// 		this.codEspecialista = codEspecialista;
// 	}

// 	public String getNomeEspecialista() {
// 		return nomeEspecialista;
// 	}

// 	public void setNomeEspecialista(String nomeEspecialista) {
// 		this.nomeEspecialista = nomeEspecialista;
// 	}

// 	public String getEmail() {
// 		return email;
// 	}

// 	public void setEmail(String email) {
// 		this.email = email;
// 	}

// 	public Date getDtNascimento() {
// 		return dtNascimento;
// 	}

// 	public void setDtNascimento(Date dtNascimento) {
// 		this.dtNascimento = dtNascimento;
// 	}

// 	public Integer getTelefoneDDD() {
// 		return telefoneDDD;
// 	}

// 	public void setTelefoneDDD(Integer telefoneDDD) {
// 		this.telefoneDDD = telefoneDDD;
// 	}

// 	public Integer getTelefone() {
// 		return telefone;
// 	}

// 	public void setTelefone(Integer telefone) {
// 		this.telefone = telefone;
// 	}

// 	public String getDescricaoSobre() {
// 		return descricaoSobre;
// 	}

// 	public void setDescricaoSobre(String descricaoSobre) {
// 		this.descricaoSobre = descricaoSobre;
// 	}

// 	public String getTipoEspecialidade() {
// 		return tipoEspecialidade;
// 	}

// 	public void setTipoEspecialidade(String tipoEspecialidade) {
// 		this.tipoEspecialidade = tipoEspecialidade;
// 	}

// 	public EspecialistaTipo getTipo() {
// 		return tipo;
// 	}

// 	public void setTipo(EspecialistaTipo tipo) {
// 		this.tipo = tipo;
// 	}

// 	public Integer getCpf() {
// 		return cpf;
// 	}

// 	public void setCpf(Integer cpf) {
// 		this.cpf = cpf;
// 	}

// 	public Integer getDigitoCpf() {
// 		return digitoCpf;
// 	}

// 	public void setDigitoCpf(Integer digitoCpf) {
// 		this.digitoCpf = digitoCpf;
// 	}

// 	public String getGenero() {
// 		return genero;
// 	}

// 	public void setGenero(String genero) {
// 		this.genero = genero;
// 	}

// 	public Integer getCep() {
// 		return cep;
// 	}

// 	public void setCep(Integer cep) {
// 		this.cep = cep;
// 	}

// 	public String getNomeRua() {
// 		return nomeRua;
// 	}

// 	public void setNomeRua(String nomeRua) {
// 		this.nomeRua = nomeRua;
// 	}

// 	public Integer getNumeroRua() {
// 		return numeroRua;
// 	}

// 	public void setNumeroRua(Integer numeroRua) {
// 		this.numeroRua = numeroRua;
// 	}

// 	public String getComplemento() {
// 		return complemento;
// 	}

// 	public void setComplemento(String complemento) {
// 		this.complemento = complemento;
// 	}

// 	public String getNomeBairro() {
// 		return nomeBairro;
// 	}

// 	public void setNomeBairro(String nomeBairro) {
// 		this.nomeBairro = nomeBairro;
// 	}

// 	public String getNomeCidade() {
// 		return nomeCidade;
// 	}

// 	public void setNomeCidade(String nomeCidade) {
// 		this.nomeCidade = nomeCidade;
// 	}

// 	public String getSigla() {
// 		return sigla;
// 	}

// 	public void setSigla(String sigla) {
// 		this.sigla = sigla;
// 	}

// 	public String getNomeEstado() {
// 		return nomeEstado;
// 	}

// 	public void setNomeEstado(String nomeEstado) {
// 		this.nomeEstado = nomeEstado;
// 	}

// 	public String getSiglaEstado() {
// 		return siglaEstado;
// 	}

// 	public void setSiglaEstado(String siglaEstado) {
// 		this.siglaEstado = siglaEstado;
// 	}

// 	@Override
// 	public String toString() {
// 		return "EspecialistaPfDto [cep=" + cep + ", codEspecialista=" + codEspecialista + ", complemento=" + complemento
// 				+ ", cpf=" + cpf + ", descricaoSobre=" + descricaoSobre + ", digitoCpf=" + digitoCpf + ", dtNascimento="
// 				+ dtNascimento + ", email=" + email + ", genero=" + genero + ", nomeBairro=" + nomeBairro
// 				+ ", nomeCidade=" + nomeCidade + ", nomeEspecialista=" + nomeEspecialista + ", nomeEstado=" + nomeEstado
// 				+ ", nomeRua=" + nomeRua + ", numeroRua=" + numeroRua + ", sigla=" + sigla + ", siglaEstado="
// 				+ siglaEstado + ", telefone=" + telefone + ", telefoneDDD=" + telefoneDDD + ", tipoEspecialidade="
// 				+ tipoEspecialidade + "]";
// 	}

// }
