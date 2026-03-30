package com.solid.OCP.comocp;

public interface ValidadorExame {

    boolean suporta(String tipoExame);

    void validar(Exame exame);
}