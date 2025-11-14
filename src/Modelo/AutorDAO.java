package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AutorDAO {
     Connection con;
     PreparedStatement ps;
     Conexion cn = new Conexion();
     
    public boolean CrearAutor (Autor au){
        String sql = "INSERT INTO autor(nombre, fecha_nacimiento, nacionalidad) VALUES (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, au.getNombre());
            ps.setDate(2, au.getFecha_nacimiento());
            ps.setString(3, au.getNacionalidad());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }        
    }
}
