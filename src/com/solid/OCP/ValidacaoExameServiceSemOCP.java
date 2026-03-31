package com.solid.OCP;

import java.util.logging.Logger;

public class ValidacaoExameServiceSemOCP {

    private static final Logger logger = Logger.getLogger(ValidacaoExameServiceSemOCP.class.getName());

    public void validar(Exame exame) {
        logger.info("Iniciando validação do exame...");

        if ("IMAGEM".equalsIgnoreCase(exame.getTipoExame())) {
            validarExameImagem(exame);
        } else {
            logger.warning("Tipo de exame não suportado: " + exame.getTipoExame());
        }

        logger.info("Validação finalizada.");
    }

    private void validarExameImagem(Exame exame) {
        logger.info("Validando exame de imagem do paciente: " + exame.getPaciente());

        if (exame.getLaudo() == null || exame.getLaudo().isBlank()) {
            logger.warning("Laudo de imagem não informado.");
            return;
        }

        logger.info("Exame de imagem validado com sucesso.");
    }
}