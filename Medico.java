/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arquivo
 */
public class Medico extends Funcionario {
    private Integer CRM;
    public Medico(String nome, String dias_trabalha, Integer CPF, Integer CRM){
        this.setNome(nome);
        this.setDias_trabalha(dias_trabalha);
        this.setCPF(CPF);
        this.CRM=CRM;
    }
    public Medico(){

    }
    public Medico(Integer CPF, Integer CRM){
        this.setCPF(CPF);
        this.setCRM(CRM);
    }
    public Integer getCRM() {
        return CRM;
    }
    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }
}
