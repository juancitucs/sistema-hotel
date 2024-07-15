package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Cargar el driver manualmente
            Class.forName("org.sqlite.JDBC");

            // Ruta relativa a tu archivo SQLite
            String url = "jdbc:sqlite:../HotelDB.sqlite";
            
            // Establecer la conexión
            connection = DriverManager.getConnection(url);
            System.out.println("Conexión establecida con éxito.");

            // Crear el objeto Statement
            Statement statement = connection.createStatement();
            
            // Ejecutar la consulta para obtener los nombres de las tablas
            String query = "SELECT name FROM sqlite_master WHERE type='table'";
            ResultSet resultSet = statement.executeQuery(query);
            
            // Iterar sobre los resultados y mostrar los nombres de las tablas
            System.out.println("Tablas en la base de datos:");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
