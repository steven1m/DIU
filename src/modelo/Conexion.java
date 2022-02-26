/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.sql.*;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author rzagza
 */
public class Conexion {
    private static Connection con = null;
    
    public static Connection getConnection(){
        try{
            ResourceBundle rb = ResourceBundle.getBundle("modelo.jdbc");
            String driver = rb.getString("driver");
            String url = rb.getString("url");
            String pass = rb.getString("pass");
            String user = rb.getString("user");
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,"Error : " + 
                    ex.getMessage());
        }
        return  con;
    }
    static class MiShDwnHook extends Thread{
        @Override
        public void run(){
            try{
                Connection con = Conexion.getConnection();
                con.close();                     
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null,"Error : " + 
                        ex.getMessage());
            }
        }
    }
}
