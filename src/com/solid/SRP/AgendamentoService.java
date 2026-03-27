package com.solid.SRP;

import java.util.logging.Logger;

public class AgendamentoService {

    private final ValidarDados validarDados;
    private final SalvarConsulta salvarConsulta;
    private final EnviarEmailConfirmacao enviarEmailConfirmacao;
    private final EnviarSmsConfirmacao enviarSmsConfirmacao;
    private final GerarResumoConsulta gerarResumoConsulta;

    public AgendamentoService() {
        this.validarDados = new ValidarDados();
        this.salvarConsulta = new SalvarConsulta();
        this.enviarEmailConfirmacao = new EnviarEmailConfirmacao();
        this.enviarSmsConfirmacao = new EnviarSmsConfirmacao();
        this.gerarResumoConsulta = new GerarResumoConsulta();
    }

    public void agendar(Consulta consulta) {

        Logger.getLogger(AgendamentoService.class.getName()).info("Iniciando processo de Agendamento.");
        validarDados.validarDados(consulta);
        salvarConsulta.salvar(consulta);
        enviarEmailConfirmacao.enviar(consulta);
        enviarSmsConfirmacao.enviar(consulta);
        gerarResumoConsulta.gerar(consulta);
    }
}



