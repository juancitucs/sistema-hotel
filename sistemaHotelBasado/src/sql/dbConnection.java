/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
/**
 *
 * @author jtx
 */
import java.io.File;
import java.sql.*;


        
public class dbConnection {
    public static Connection connect() {
        Connection con = null;
        String url = "jdbc:sqlite:src/sql/hotel.db"; // Usa la ruta relativa correcta

        try {
            // Verificar si el archivo de la base de datos existe
            File dbFile = new File("src/sql/hotel.db");
            if (!dbFile.exists()) {
                System.out.println("La base de datos no existe en: " + dbFile.getAbsolutePath());
                return null;
            }

            // Cargar el driver de SQLite
            Class.forName("org.sqlite.JDBC");
            //System.out.println("Driver cargado exitosamente.");

            // Conectar a la base de datos
            con = DriverManager.getConnection(url);
            //System.out.println("Conexión exitosa!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver de SQLite no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
        return con;
    }
}
