package com.solid.OCP;

import java.util.logging.Logger;

public class OcpMain {

    private static final Logger logger = Logger.getLogger(OcpMain.class.getName());

    public static void main(String[] args) {

        Exame exame1 = new Exame(
                "Paciente Teste 1",
                "IMAGEM",
                "Envio Laudo"
        );

        Exame exame2 = new Exame(
                "Paciente Teste 2",
                "LABORATORIO",
                "Envio Laudo",
                "Hemograma completo dentro dos parâmetros esperados."
        );

        logger.info("Dados do exame1 -> " + exame1);
        logger.info("Dados do exame2 -> " + exame2);

        ValidacaoExameService validacaoExameService = new ValidacaoExameService();
        validacaoExameService.validar(exame1);
        validacaoExameService.validar(exame2);
    }
}