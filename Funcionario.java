/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arquivo
 */
public class Funcionario {

    private String nome;
    private String dias_trabalha;
    private int CPF;
    public Funcionario(){
        
    }
    public Funcionario(String nome, String dias_trabalha, Integer CPF){
        this.nome=nome;
        this.dias_trabalha=dias_trabalha;
        this.CPF=CPF;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDias_trabalha() {
        return dias_trabalha;
    }

    public void setDias_trabalha(String dias_trabalha) {
        this.dias_trabalha = dias_trabalha;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF=CPF;
    }
}
