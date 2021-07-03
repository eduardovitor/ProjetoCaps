import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    public void inserirMedico(Medico med) {
        String sql = "INSERT INTO medico(CRM, cpf_fk_func_med) VALUES (?,?)";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, med.getCRM());
            pst.setInt(2, med.getCPF());
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Medico> listarMedico() {
        List<Medico> listaMedico = new ArrayList<Medico>();
        String sql = "SELECT * FROM medico";

        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer CRM = rs.getInt("CRM");
                Integer CPF=rs.getInt("cpf_fk_func_enf");
                listaMedico.add(new Medico(CRM,CPF));
            }
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaMedico;
    }
    public void removerMedico(Integer CRM) {
        String sql = "DELETE FROM medico WHERE CRM=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, CRM);
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void updateMedico(Integer CPF, Integer CRM_novo) {
        String sql = "UPDATE medico SET CRM=? WHERE cpf_fk_func_med=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, CRM_novo);
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
