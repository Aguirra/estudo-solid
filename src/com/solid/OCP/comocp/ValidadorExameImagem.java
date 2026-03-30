package com.solid.OCP.comocp;

import java.util.logging.Logger;

public class ValidadorExameImagem implements ValidadorExame {

    private static final Logger logger = Logger.getLogger(ValidadorExameImagem.class.getName());

    @Override
    public boolean suporta(String tipoExame) {
        return "IMAGEM".equalsIgnoreCase(tipoExame);
    }

    @Override
    public void validar(Exame exame) {
        logger.info("Validando exame de imagem do paciente: " + exame.getPaciente());

        if (exame.getLaudo() == null || exame.getLaudo().isBlank()) {
            logger.warning("Laudo de imagem não informado.");
            return;
        }

        logger.info("Exame de imagem validado com sucesso.");
    }
}