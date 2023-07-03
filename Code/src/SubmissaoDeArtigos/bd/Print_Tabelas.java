package SubmissaoDeArtigos.bd;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//Para mostrar você deve executar essa classe, de preferência separadamente, clicando run file
public class Print_Tabelas {
    public static void main(String[] args) {
        try {
            // Estabelecer conexÃ£o com o banco de dados Derby
            String jdbcUrl = "jdbc:derby:banco";
            Connection connection = DriverManager.getConnection(jdbcUrl);

            // Obter metadados do banco de dados
            DatabaseMetaData metaData = connection.getMetaData();

            // Consultar as tabelas do banco de dados
            ResultSet resultSet = metaData.getTables(null, null, null, new String[] {"TABLE"});

            // Imprimir o nome das tabelas
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                System.out.println(tableName);
            }

            // Fechar a conexÃ£o
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
