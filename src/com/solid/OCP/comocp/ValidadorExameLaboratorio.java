package com.solid.OCP.comocp;

import java.util.logging.Logger;

public class ValidadorExameLaboratorio implements ValidadorExame {

    private static final Logger logger = Logger.getLogger(ValidadorExameLaboratorio.class.getName());

    @Override
    public boolean suporta(String tipoExame) {
        return "LABORATORIO".equalsIgnoreCase(tipoExame);
    }

    @Override
    public void validar(Exame exame) {
        logger.info("Validando exame laboratorial do paciente: " + exame.getPaciente());

        if (exame.getDescricao() == null || exame.getDescricao().isBlank()) {
            logger.warning("Descrição do exame laboratorial não informada.");
            return;
        }

        logger.info("Exame laboratorial validado com sucesso.");
    }
}