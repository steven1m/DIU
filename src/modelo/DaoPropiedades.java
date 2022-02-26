/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class DaoPropiedades {
        
    public ArrayList<String> leer(int id){
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<String> lista = new ArrayList<>();
        try{
            con = Conexion.getConnection();
            String sentencia = "";
            sentencia = "SELECT * FROM propiedad"; 
            ps = con.prepareStatement(sentencia);
            rs = ps.executeQuery();
                       
            Propiedad propiedad = new Propiedad();
            while(rs.next()){
                propiedad.addToProperties(rs.getString("nombre_propiedad"));
            }
            lista = propiedad.getPropiedades();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return lista;
    }
    
    public int insertar(String nombre, String valor){
        int resultado = 0;
        Connection con ;
        PreparedStatement ps;
        String sentencia = "UPDATE propiedad SET valor=? "
                + "WHERE nombre_propiedad=?";
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement(sentencia);
            ps.setString(1, valor);
            ps.setString(2, nombre);
            resultado = ps.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error : " + 
                    ex.getMessage());
        }
        return resultado;
    }
}
