package com.solid.LSP;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumentoPrincipal() {return cnpj;}

    @Override
    public String getDataNascimento() {
        throw new UnsupportedOperationException("Pessoa jurídica <NÃO> possui data de nascimento.");
    }
}

