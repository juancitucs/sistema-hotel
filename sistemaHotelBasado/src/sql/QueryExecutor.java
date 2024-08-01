package sql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecutor {

    public static void main(String[] args) {
        String query = "SELECT * FROM usuarios"; // Consulta SQL aquí
        executeAndPrintQuery(query);
    }
    
    

    public static void executeAndPrintQuery(String query) {
        Connection con = dbConnection.connect(); // <---- conexion
        if (con == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // Imprimir encabezados de columna
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();

            // Imprimir filas
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta.");
            e.printStackTrace();
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión.");
                ex.printStackTrace();
            }
        }
    }
}
