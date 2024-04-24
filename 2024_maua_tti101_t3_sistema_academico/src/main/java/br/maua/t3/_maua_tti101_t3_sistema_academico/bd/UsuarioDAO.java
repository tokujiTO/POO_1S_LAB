package br.maua.t3._maua_tti101_t3_sistema_academico.bd;

import br.maua.t3._maua_tti101_t3_sistema_academico.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TiagoTokugi
 */
public class UsuarioDAO {
    //Agora estamos de acordo com uma clausula catch or declare do compilador java, das duas uma: ou vc faz try catch ou vc faz throws
    public boolean existe(Usuario u) throws Exception{
        //JDBC Java DataBase Connectivity
        //especificar o comando sql (SELECT)
        var sql = "SELECT * FROM tb_usuario_t3 WHERE login = ? and senha = ?";
        //Estabelecer um conexão com o bd usando a connection factory 
        Connection conexao = new ConnectionFactory().obterConexão();
        //Preparar o coamando (Pré compilar)a
        PreparedStatement ps = conexao.prepareStatement(sql);
        //Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //Executar o comando
        ResultSet rs = ps.executeQuery();
        //Tratar o resultado (Verificar se o usuario exite na tavela resultante)
        boolean achou = rs.next();
        //fecgar a conexão 
        conexao.close();
        //Devover o resultado obtido (true ou false)
        return achou;
    }
}
