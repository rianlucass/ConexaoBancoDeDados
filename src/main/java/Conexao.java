import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/db_users";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection conn;

    public static Connection conectar() {
        try{
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        }catch (SQLException e){
            System.out.println("Erro ao conectar: " + e);
            return null;
        }

    }
}
