package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//DELETE
public class TesteBanco04 {
    public static void main(String[] args) {
        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "DELETE from aluno WHERE numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 10);
            var numLinhasAfetadas = ps.executeUpdate();
            System.out.println("Total de linhas afetadas: " + numLinhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

