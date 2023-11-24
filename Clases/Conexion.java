/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //Patron de diseño Singleton implementado.
    
    //Declaramos una única instancia de la clase Conexion como privada y estática.
    private static Conexion instancia;
    
    //Declaramos una variable de tipo Connection para almacenar la conexión a la base de datos.
    private Connection con;

    //El constructor de la clase es privado para evitar la creación directa de instancias desde fuera de la clase.
    private Conexion() {
        try {
            //En el constructor se carga el driver de MySQL y se establece la conexión a la base de datos.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "eimirosa");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MySQL: " + e.getMessage());
            throw new RuntimeException("Error al cargar el driver de MySQL", e);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw new RuntimeException("Error al conectar a la base de datos", e);
        }
    }

    //Método estático para obtener la única instancia de la clase.
    public static Conexion getInstance() {
        if (instancia == null) {
            //Si la instancia no existe se crea una nueva instancia llamando al constructor privado.
            instancia = new Conexion();
        }
        return instancia;
    }

    //Método para obtener la conexión a la base de datos.
    public Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "eimirosa");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la conexión: " + e.getMessage());
            throw new RuntimeException("Error al obtener la conexión", e);
        }
        return con;
    }
}
