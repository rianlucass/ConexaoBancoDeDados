import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consult {
    public static void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()){
            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("ID:" + id + "\nNome: " + nome + "\nEmail: " + email);
            }
        } catch (SQLException e) {
            System.err.println("Não foi possivel conectar, erro: " + e);
        }
    }
}
