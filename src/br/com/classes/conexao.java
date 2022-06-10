package br.com.classes;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.*;

import javax.swing.JOptionPane;

public class conexao {
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pa;
    
    String url = "jdbc:mysql://localhost:3306/bancoaula";
    String  user = "root";
    String  password = "";
    String driver = "com.mysql.jdbc.Driver";
    
    public void OpenConexa(){
        try{
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o BD ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }
}
