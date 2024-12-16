import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void inserirDados(String nome, String email, String senha) {
        String sql = "INSERT INTO usuarios(nome, senha, email) VALUES (?, ?, ?)";
        try(Connection conn = Conexao.conectar()) {
            assert conn != null;
            try(PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, nome);
                stmt.setString(2, senha);
                stmt.setString(3, email);
                int qtd = stmt.executeUpdate();
                System.out.println("Quantidade de cadastro inserido: " + qtd);
            }
        } catch (SQLException e) {
            System.err.println("Não foi possivel inserir, erro:" + e);
        }
    }
}
