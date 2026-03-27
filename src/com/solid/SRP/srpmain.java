package com.solid.SRP;

import java.time.LocalDate;
import java.util.logging.Logger;

public class srpmain {

    private static final Logger logger = Logger.getLogger(srpmain.class.getName());

    public static void main (String[] args) {
        logger.info("Inicio de Prcesso - Estudo SOLID (Princípio da responsabilidade única)");
        AgendamentoService agendamentoService = new AgendamentoService();

        Consulta consulta = new Consulta(
                "Paciente Teste 1" ,
                "Consulta Teste",
                LocalDate.of(1970,07,14) );

        logger.info("Dados Consulta do Paciente - SRP -> " + consulta.toString());
        agendamentoService.agendar(consulta);

        logger.info("Fim do processo de Agendamento.");
    }

}


