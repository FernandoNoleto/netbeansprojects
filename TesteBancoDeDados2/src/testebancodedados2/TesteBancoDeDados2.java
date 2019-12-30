/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebancodedados2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class TesteBancoDeDados2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco_1","postgres","Fernando102030");
            Statement instrucao = con.createStatement();
            instrucao.executeUpdate("insert into cliente values('fernando', '123')");
            JOptionPane.showMessageDialog(null, "Inserção executada com sucesso!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO: "+e);
        }
        
    }
    
}