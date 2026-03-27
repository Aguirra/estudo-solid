package com.solid.SRP;

public class AgendamentoServiceNew {

    private final ValidarDados validarDados;
    private final SalvarConsulta salvarConsulta;
    private final EnviarEmailConfirmacao enviarEmailConfirmacao;
    private final EnviarSmsConfirmacao enviarSmsConfirmacao;
    private final GerarResumoConsulta gerarResumoConsulta;

    public AgendamentoServiceNew() {
        this.validarDados = new ValidarDados();
        this.salvarConsulta = new SalvarConsulta();
        this.enviarEmailConfirmacao = new EnviarEmailConfirmacao();
        this.enviarSmsConfirmacao = new EnviarSmsConfirmacao();
        this.gerarResumoConsulta = new GerarResumoConsulta();
    }

    public void agendar(Consulta consulta) {
        validarDados.validarDados(consulta);
        salvarConsulta.salvar(consulta);
        enviarEmailConfirmacao.enviar(consulta);
        enviarSmsConfirmacao.enviar(consulta);
        gerarResumoConsulta.gerar(consulta);
    }

}

