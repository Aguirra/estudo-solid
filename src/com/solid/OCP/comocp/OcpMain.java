package com.solid.OCP.comocp;

import java.util.List;
import java.util.logging.Logger;

public class OcpMain {

    private static final Logger logger = Logger.getLogger(OcpMain.class.getName());

    public static void main(String[] args) {

        Exame exameImagem = new Exame(
                "Paciente Teste 1",
                "IMAGEM",
                "Laudo de tomografia sem alterações."
        );

        Exame exameLaboratorio = new Exame(
                "Paciente Teste 2",
                "LABORATORIO",
                "Hemograma",
                "Hemograma completo dentro dos padrões esperados."
        );

        ValidacaoExameService validacaoExameService = new ValidacaoExameService(
                List.of(
                        new ValidadorExameImagem(),
                        new ValidadorExameLaboratorio()
                )
        );

        logger.info("Validando exame de imagem -> " + exameImagem);
        validacaoExameService.validar(exameImagem);

        logger.info("Validando exame laboratorial -> " + exameLaboratorio);
        validacaoExameService.validar(exameLaboratorio);
    }
}