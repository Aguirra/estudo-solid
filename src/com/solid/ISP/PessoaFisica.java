package com.solid.ISP;

public class PessoaFisica extends Pessoa implements CadastroPessoaFisica {

    private String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDataNascimento() {
        return dataNascimento;
    }

}

