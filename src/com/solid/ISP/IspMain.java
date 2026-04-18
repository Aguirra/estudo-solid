package com.solid.ISP;

public class IspMain {

    public static void main(String[] args) {

        Pessoa pessoaFisica = new PessoaFisica(
                "Paciente Teste", "123.456.789-00", "01/01/1990");

        Pessoa pessoaJuridica = new PessoaJuridica(
                "Laboratorio XYZ", "12.345.678/0001-99");

        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Documento: " + pessoaFisica.getDocumentoPrincipal());


        if (pessoaFisica instanceof PessoaFisica pf) {
            System.out.println("Data de nascimento: " + pf.getDataNascimento());
        }

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Documento: " + pessoaJuridica.getDocumentoPrincipal());

        if (pessoaJuridica instanceof CadastroPessoaJuridica pj) {
            System.out.println("Razão social: " + pj.getRazaoSocial());
        }

    }
}



