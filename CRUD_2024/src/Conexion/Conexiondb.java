package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexiondb {
    static String URL = "jdbc:mysql://database-1.cmkott3b64cq.us-east-1.rds.amazonaws.com:3306/"
            + "persona_crud?useUnicode=true&characterEncoding=UTF-8";
    static String USER = "Vicente";
    static String PASSWORD = "vicente75198234";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}
