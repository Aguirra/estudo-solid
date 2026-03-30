package com.solid.OCP.comocp;

import java.util.List;
import java.util.logging.Logger;

public class ValidacaoExameService {

    private static final Logger logger = Logger.getLogger(ValidacaoExameService.class.getName());

    private final List<ValidadorExame> validadores;

    public ValidacaoExameService(List<ValidadorExame> validadores) {
        this.validadores = validadores;
    }

    public void validar(Exame exame) {
        logger.info("Iniciando validação do exame...");

        for (ValidadorExame validador : validadores) {
            if (validador.suporta(exame.getTipoExame())) {
                validador.validar(exame);
                logger.info("Validação finalizada.");
                return;
            }
        }

        logger.warning("Nenhum validador encontrado para o tipo de exame: " + exame.getTipoExame());
    }
}