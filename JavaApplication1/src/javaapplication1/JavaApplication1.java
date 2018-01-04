/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */

public class JavaApplication1 {
    public Connection conn = null;

    public void connectSQL() throws SQLException{ 
          try { 
           String userName =""; 
           String password = ""; 
           String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSanpham;"; 
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
           conn = java.sql.DriverManager.getConnection(url,userName,password); 
          } 
          catch (ClassNotFoundException e) { 
            JOptionPane.showMessageDialog(null,"Ket noi CSDL that bai","Thong bao",1); 
          } 
       } 
       //Phuong thuc dung de truy van CSDL 
       public ResultSet LoadData(String sql){ 
          ResultSet result = null; 
          try { 
            Statement statement = conn.createStatement(); 
            return statement.executeQuery(sql); 
          } catch (SQLException e) { 
            e.printStackTrace(); 
             return null ; 
          } 
       } 
    public static void main(String[] args) {
        
    }
    
}
