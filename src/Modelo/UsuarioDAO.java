package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
     Connection con;
     PreparedStatement ps;
     Conexion cn = new Conexion();
     
     public boolean CrearUsuario (login us){
         String sql = "INSERT INTO usuario(tipo_usuario, nombre, correo, direccion, password) VALUES (?,?,?,?,?)";
         try {
             con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, us.getTipo_usuario());
             ps.setString(2, us.getNombre());
             ps.setString(3, us.getCorreo());
             ps.setString(4, us.getDireccion());
             ps.setString(5, us.getPassword());
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
