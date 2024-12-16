import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void excluirUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            int qtd = stmt.executeUpdate();
            System.out.println("Quantidade de cadastro deletada: " + qtd);
        } catch (SQLException e) {
            System.err.println("Erro ao remover o id " + id + " : " + e.getMessage());
        }
    }
}
