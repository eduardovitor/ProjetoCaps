

import java.util.ArrayList;

public class Paciente {
    private Integer cpf;
    private String nome,nome_mae;
    private boolean participa_atividades;
    private Medico medico;
    private Psicologo psicologo;

    public Paciente(Integer CPF, String nome, String nome_mae, boolean participa_atividades, Integer CRM, Integer CRP){
        Medico med=new Medico();
        Psicologo psi=new Psicologo();
        this.cpf=CPF;
        this.nome=nome;
        this.nome_mae=nome_mae;
        this.participa_atividades=participa_atividades;
        med.setCRM(CRM);
        psi.setCRP(CRP);
        this.setMedico(med);
        this.setPsicologo(psi);
    }
    public Paciente(){

    }
    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {

        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public boolean isParticipa_atividades() {
        return participa_atividades;
    }

    public void setParticipa_atividades(boolean participa_atividades) {
        this.participa_atividades = participa_atividades;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

}
