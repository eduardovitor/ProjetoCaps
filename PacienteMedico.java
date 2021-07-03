
public class PacienteMedico {
    private Paciente paciente;
    private Medico medico;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
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
