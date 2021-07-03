import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) {
        FuncionarioDAO fun_dao=new FuncionarioDAO();
        Funcionario fun=new Funcionario("Neide Vital","Segunda, Quarta, Quinta",678974);
        Medico medico=new Medico(678974,340);
        MedicoDAO med_dao=new MedicoDAO();
        Paciente pac=new Paciente(444,"Carlos","Rosane",true,340,800);
        PacienteDAO pac_dao=new PacienteDAO();
     //   pac_dao.inserirPaciente(pac);
        pac_dao.updatePaciente(444,false);
    }
}
