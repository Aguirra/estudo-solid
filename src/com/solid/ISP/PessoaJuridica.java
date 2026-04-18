package com.solid.ISP;


public class PessoaJuridica extends Pessoa implements CadastroPessoaJuridica{

    private String razaoSocial;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
        this.razaoSocial = nome;
    }

    @Override
    public String getRazaoSocial() {
        return razaoSocial;
    }
}


