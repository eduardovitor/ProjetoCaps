import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PsicologoDAO {
    public void inserirPsicologo(Psicologo psi) {
        String sql = "INSERT INTO psicologo(CRP, cpf_fk_func_psi) VALUES (?,?)";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, psi.getCRP());
            pst.setInt(2, psi.getCPF());
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Psicologo> listarPsicologo() {
        List<Psicologo> listaPsicologo = new ArrayList<Psicologo>();
        String sql = "SELECT * FROM psicologo";

        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer CRP = rs.getInt("CRP");
                Integer CPF=rs.getInt("cpf_fk_func_psi");
                listaPsicologo.add(new Psicologo(CRP,CPF));
            }
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaPsicologo;
    }
    public void removerPsicologo(Integer CRP) {
        String sql = "DELETE FROM psicologo WHERE CRP=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, CRP);
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void updateMedico(Integer CPF, Integer CRP_novo) {
        String sql = "UPDATE psicologo SET CRP=? WHERE cpf_fk_func_psi=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, CRP_novo);
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
