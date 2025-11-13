package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
     Connection con;
     PreparedStatement ps;
     ResultSet rs;
     Conexion cn = new Conexion();
     
     public login log (String correo, String password ){
         login l = new login();
         String sql = "SELECT * FROM usuario WHERE correo = ? AND password = ?";
         
         try {
             con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, correo);
             ps.setString(2, password);
             rs = ps.executeQuery();
             if (rs.next()) {
                 l.setId_usuario(rs.getInt("id_usuario"));
                 l.setTipo_usuario(rs.getString("tipo_usuario"));
                 l.setNombre(rs.getString("nombre"));
                 l.setCorreo(rs.getString("correo"));
                 l.setDireccion(rs.getString("direccion"));
                 l.setPassword(rs.getString("password"));
             }
         } catch (SQLException e) {
             System.out.println(e.toString());
         }
         return l;
     }
     
}
