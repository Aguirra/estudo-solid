package com.solid.OCP;

public class Exame {

    private String paciente;
    private String tipoExame;
    private String laudo;
    private String descricao;

    public Exame () {}

    public Exame(String paciente, String tipoExame, String laudo) {
        this.paciente = paciente;
        this.tipoExame = tipoExame;
        this.laudo = laudo;
    }
    public Exame(String paciente, String tipoExame, String laudo, String descricao) {
        this.paciente = paciente;
        this.tipoExame = tipoExame;
        this.laudo = laudo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "paciente='" + paciente + '\'' +
                ", tipoExame='" + tipoExame + '\'' +
                ", laudo='" + laudo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public String getPaciente() {
        return paciente;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public String getLaudo() {
        return laudo;
    }

    public String getDescricao() {
        return descricao;
    }
}
