
public class Paciente_Enfermeiro {

    private Paciente paciente;
    private Enfermeiro enfermeiro;
    private String obsConsulta;
    private String dataAtendimento;
    private boolean levouRemedio;
    private String tipoAtendimento;
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public String getObsConsulta() {
        return obsConsulta;
    }

    public void setObsConsulta(String obsConsulta) {
        this.obsConsulta = obsConsulta;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public boolean isLevouRemedio() {
        return levouRemedio;
    }

    public void setLevouRemedio(boolean levouRemedio) {
        this.levouRemedio = levouRemedio;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
}