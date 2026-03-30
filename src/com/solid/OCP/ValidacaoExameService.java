package com.solid.OCP;

import java.util.logging.Logger;

public class ValidacaoExameService {

    private static final Logger logger = Logger.getLogger(ValidacaoExameService.class.getName());

    public void validar(Exame exame) {
        logger.info("Iniciando validação do exame...");

        if ("IMAGEM".equalsIgnoreCase(exame.getTipoExame())) {
            validarExameImagem(exame);
        } else if ("LABORATORIO".equalsIgnoreCase(exame.getTipoExame())) {
            validarExameLaboratorial(exame);
        } else {
            logger.warning("Tipo de exame não suportado: " + exame.getTipoExame());
        }

        logger.info("Validação finalizada.");
    }

    private void validarExameImagem(Exame exame) {
        logger.info("Validando exame de imagem do paciente: " + exame.getPaciente());

        if (exame.getDescricao() == null || exame.getDescricao().isBlank()) {
            logger.warning("Laudo de imagem não informado.");
            return;
        }

        logger.info("Exame de imagem validado com sucesso.");
    }

    private void validarExameLaboratorial(Exame exame) {
        logger.info("Validando exame laboratorial do paciente: " + exame.getPaciente());

        if (exame.getDescricao() == null || exame.getDescricao().isBlank()) {
            logger.warning("Resultado laboratorial não informado.");
            return;
        }

        logger.info("Exame laboratorial validado com sucesso.");
    }
}