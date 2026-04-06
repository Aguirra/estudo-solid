package com.solid.LSP;

public class LspMain {

    public static void main(String[] args) {

        Pessoa pf = new PessoaFisica("Paciente Teste", "123.456.789-00", "01/01/1990");
        Pessoa pj = new PessoaJuridica("Laboratorio XYZ", "12.345.678/0001-99");

        System.out.println("Pessoa Física:");
        System.out.println(pf.getNome());
        System.out.println(pf.getDocumentoPrincipal());
        System.out.println(pf.getDataNascimento());

        System.out.println("\nPessoa Jurídica:");
        System.out.println(pj.getNome());
        System.out.println(pj.getDocumentoPrincipal());
        System.out.println(pj.getDataNascimento());
    }
}