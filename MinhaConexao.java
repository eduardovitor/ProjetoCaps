import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MinhaConexao {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        final String driver = "com.mysql.cj.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/caps";

        final String user = "root";
        final String pwd = "";

        Class.forName(driver);
        System.out.println("Driver carregado com sucesso!");

        Connection connection = DriverManager.getConnection(url, user, pwd);
        System.out.println("Conexão realizada com sucesso!");

        return connection;
    }
}
