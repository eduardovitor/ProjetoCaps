import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    public void inserirPaciente(Paciente pac) {
        String sql = "INSERT INTO paciente(CPF_pac,nome,nome_mae,participa_atividades,crm_medico,crp_psicologo ) VALUES (?,?,?,?,?,?)";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, pac.getCpf());
            pst.setString(2, pac.getNome());
            pst.setString(3, pac.getNome_mae());
            pst.setBoolean(4, pac.isParticipa_atividades());
            pst.setInt(5, pac.getMedico().getCRM());
            pst.setInt(6, pac.getPsicologo().getCRP());
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Paciente> listarPaciente() {
        List<Paciente> listaPaciente = new ArrayList<Paciente>();
        String sql = "SELECT * FROM paciente";

        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer CPF_pac = rs.getInt("CPF_pac");
                String nome=rs.getString("nome");
                String nome_mae=rs.getString("nome_mae");
                Boolean participa=rs.getBoolean("participa_atividades");
                Integer CRM=rs.getInt("crm_medico");
                Integer CRP=rs.getInt("crp_psicologo");
                listaPaciente.add(new Paciente(CPF_pac,nome,nome_mae,participa,CRM,CRP));
            }
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaPaciente;
    }
    public void removerPaciente(Integer CPF) {
        String sql = "DELETE FROM paciente WHERE CPF_pac=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, CPF);
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void updatePaciente(Integer CPF, boolean participa_atividades_novo) {
        String sql = "UPDATE paciente SET participa_atividades=? WHERE CPF_pac=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setBoolean(1, participa_atividades_novo);
            pst.setInt(2, CPF);
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
