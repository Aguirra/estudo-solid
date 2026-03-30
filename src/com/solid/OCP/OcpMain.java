package com.solid.OCP;

import java.util.logging.Logger;

public class OcpMain {

    private static final Logger logger = Logger.getLogger(OcpMain.class.getName());

    public static void main(String[] args) {

        Exame exame = new Exame(
                "Paciente Teste 1",
                "IMAGEM",
                "Laudo de ressonância magnética sem alterações."
        );

        logger.info("Dados do exame -> " + exame);

        ValidacaoExameService validacaoExameService = new ValidacaoExameService();
        validacaoExameService.validar(exame);
    }
}