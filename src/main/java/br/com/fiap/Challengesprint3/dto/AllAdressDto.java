package br.com.fiap.Challengesprint3.dto;

import br.com.fiap.Challengesprint3.models.Endereco;

public class AllAdressDto {
    private Endereco endereco;

    public AllAdressDto() {
        super();
    }

    public AllAdressDto(Endereco endereco) {
        super();
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Endereço: \n Cep: " + endereco.getCep() + " Complemento: " + endereco.getComplemento()
                + "nomeRua: " + endereco.getNomeRua() + " NumeroRua" + endereco.getNumeroRua() 
                + "bairro:" + endereco.getBairro().getNomeBairro();
    }
    
}
