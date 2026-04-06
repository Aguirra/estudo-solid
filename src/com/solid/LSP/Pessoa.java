package com.solid.LSP;

public abstract class Pessoa {

    protected String nome;

    public Pessoa(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public abstract String getDocumentoPrincipal();
    public abstract String getDataNascimento();
}

