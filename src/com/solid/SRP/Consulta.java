package com.solid.SRP;

import java.time.LocalDate;

public class Consulta {

    private String nome;
    private String nomeConsulta;
    private LocalDate dataNascimento;

    public Consulta () {}

    public Consulta(String nome, String nomeConsulta, LocalDate dataNascimento) {
        this.nome = nome;
        this.nomeConsulta = nomeConsulta;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "nome='" + nome + '\'' +
                ", nomeConsulta='" + nomeConsulta + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
