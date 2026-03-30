package com.solid.OCP;

public class Exame {

    private String paciente;
    private String tipoExame;
    private String laudo;

    public Exame(String paciente, String tipoExame, String laudo) {
        this.paciente = paciente;
        this.tipoExame = tipoExame;
        this.laudo = laudo;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "paciente='" + paciente + '\'' +
                ", tipoExame='" + tipoExame + '\'' +
                ", laudo='" + laudo + '\'' +
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
}
