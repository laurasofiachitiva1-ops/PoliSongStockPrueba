package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/polisongstockmarketplacepa?serverTimeZone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    } /*"jdbc:mysql://localhost:3306/polisongstockmarketplacepa?serverTimeZone=UTC"*/
    
    
    /*public static Connection Conectar(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/polisongstockmarketplacepa","root","");
        } catch (Exception e) {
            System.out.println(String.valueOf(e));   
        }
        return cn;
    }*/
}
