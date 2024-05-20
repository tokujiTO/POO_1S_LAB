/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t3._maua_tti101_t3_sistema_academico.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author TiagoTokugi
 */
public class ConnectionFactory {
    private String host = "mysql-387e0124-tiagomassuda123-850a.b.aivencloud.com";
    private String port = "23042";
    private String db = "defaultdb";
    private String user = "avnadmin";
    private String password = "AVNS_Th71u61UU4O3AOhdubc";
    
    
    public Connection obterConexao(){
        try{
            String stringConexao = String.format(
                "jdbc:mysql://%s:%s/%s", host, port, db
            );
            var conexao = DriverManager.getConnection(
                stringConexao, user, password
            );
            return conexao;
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "erro no connectionFactory!");
            return null;
        }
    
    }

}
