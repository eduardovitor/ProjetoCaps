/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author arquivo
 */
public class Psicologo extends Funcionario {
    private Integer CRP;
    
    public Psicologo(String nome, String dias_trabalha, Integer CPF, Integer CRP){
        this.setNome(nome);
        this.setDias_trabalha(dias_trabalha);
        this.setCPF(CPF);
        this.CRP=CRP;
    }
    public Psicologo(Integer CRP, Integer CPF){
        this.CRP=CRP;
        this.setCPF(CPF);
    }
    public Psicologo(){

    }
    public Integer getCRP() {
        return CRP;
    }

    public void setCRP(Integer CRP) {
        this.CRP = CRP;
    }
    
}
