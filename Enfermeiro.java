/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arquivo
 */
public class Enfermeiro extends Funcionario {
    private Integer Coren;
    public Enfermeiro(String nome, String dias_trabalha, Integer CPF, Integer Coren){
        this.setNome(nome);
        this.setDias_trabalha(dias_trabalha);
        this.setCPF(CPF);
        this.Coren=Coren;
    }
    public Enfermeiro(Integer Coren, Integer CPF){
        this.setCoren(Coren);
        this.setCPF(CPF);
    }
    public int getCoren() {
        return Coren;
    }

    public void setCoren(Integer Coren) {
        this.Coren = Coren;
    }
    
}
