import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EnfermeiroDAO {
    public void inserirEnfermeiro(Enfermeiro enf) {
                String sql = "INSERT INTO enfermeiro(COREN, cpf_fk_func_enf) VALUES (?,?)";
                try {
                    Connection connection = MinhaConexao.getConnection();
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setInt(1, enf.getCoren());
                    pst.setInt(2, enf.getCPF());
                    pst.execute();
                    pst.close();
                    connection.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            public List<Enfermeiro> listarEnfermeiro() {
                List<Enfermeiro> listaEnfermeiro = new ArrayList<Enfermeiro>();
                String sql = "SELECT * FROM enfermeiro";

                try {
                    Connection connection = MinhaConexao.getConnection();
                    PreparedStatement pst = connection.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        Integer coren = rs.getInt("COREN");
                        Integer CPF=rs.getInt("cpf_fk_func_enf");
                        listaEnfermeiro.add(new Enfermeiro(coren,CPF));
                    }
                    pst.close();
                    connection.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                return listaEnfermeiro;
            }
            public void removerEnfermeiro(Integer Coren) {
                String sql = "DELETE FROM enfermeiro WHERE COREN=?";
                try {
                    Connection connection = MinhaConexao.getConnection();
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setInt(1, Coren);
                    pst.execute();
                    pst.close();
                    connection.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            public void updateEnfermeiro(Integer CPF, Integer Coren_novo) {
                String sql = "UPDATE enfermeiro SET COREN=? WHERE cpf_fk_func_enf=?";
                try {
                    Connection connection = MinhaConexao.getConnection();
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setInt(1, Coren_novo);
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
