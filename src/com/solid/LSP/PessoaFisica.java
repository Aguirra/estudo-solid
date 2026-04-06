package com.solid.LSP;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String cpf, String dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDocumentoPrincipal() {return cpf;}

    @Override
    public String getDataNascimento() {return dataNascimento;}
}

