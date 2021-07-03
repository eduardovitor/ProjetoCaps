import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO {
    public void inserirFuncionario(Funcionario fun) {
        String sql = "INSERT INTO funcionario(nome, dias_trabalha, CPF_func) VALUES (?,?,?)";

        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, fun.getNome());
            pst.setString(2, fun.getDias_trabalha());
            pst.setInt(3, fun.getCPF());
            pst.execute();
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        String sql = "SELECT * FROM funcionario";

        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String dias_trabalha=rs.getString("dias_trabalha");
                int  CPF  = rs.getInt("CPF_func");
                listaFuncionarios.add(new Funcionario(nome, dias_trabalha,CPF));
            }
            pst.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaFuncionarios;
    }
    public void removerFuncionario(Integer CPF) {
        String sql = "DELETE FROM funcionario WHERE CPF_func=?";
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
    public void updateFuncionario(int CPF, String nome_novo, String dias_trabalha) {
        String sql = "UPDATE funcionario SET nome=?, dias_trabalha=? WHERE CPF_func=?";
        try {
            Connection connection = MinhaConexao.getConnection();
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, nome_novo);
            pst.setString(2, dias_trabalha);
            pst.setInt(3, CPF);
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