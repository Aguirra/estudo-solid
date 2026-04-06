package com.solid.LSP.comLsp;

public class PessoaFisica extends Pessoa {

    private String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}

