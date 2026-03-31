package com.solid.OCP;

import java.util.logging.Logger;

public class OcpMainSemOCP {

    private static final Logger logger = Logger.getLogger(OcpMainSemOCP.class.getName());

    public static void main(String[] args) {

        Exame exame1 = new Exame(
                "Paciente Teste 1",
                "IMAGEM",
                "Envio Laudo"
        );

        logger.info("Dados do exame1 -> " + exame1);

        ValidacaoExameServiceSemOCP validacaoExameServiceSemOCP = new ValidacaoExameServiceSemOCP();
        validacaoExameServiceSemOCP.validar(exame1);
    }
}