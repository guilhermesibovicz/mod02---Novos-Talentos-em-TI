package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//UPDATE
public class TesteBanco03 {
    public static void main(String[] args) {
        var stringConnexao = "jdbc:mariadb://localhost/dbexerc1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "UPDATE aluno SET nome = ? WHERE numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Maga Pata da Silva");
            ps.setInt(2, 10);
            ps.executeUpdate();
            var numLinhasAfetadas = ps.executeUpdate();
            System.out.println("Total de linhas afetadas: " + numLinhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
