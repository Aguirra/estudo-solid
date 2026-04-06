package com.solid.LSP.comLsp;

public abstract class Pessoa {

    protected String nome;
    protected String documentoPrincipal;

    public Pessoa(String nome, String documentoPrincipal) {
        this.nome = nome;
        this.documentoPrincipal = documentoPrincipal;
    }

    public String getNome() {
        return nome;
    }
    public String getDocumentoPrincipal() {
        return documentoPrincipal;
    }
}

