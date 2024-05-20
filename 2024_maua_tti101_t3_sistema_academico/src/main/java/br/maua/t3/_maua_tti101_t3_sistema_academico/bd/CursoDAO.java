/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t3._maua_tti101_t3_sistema_academico.bd;

import br.maua.t3._maua_tti101_t3_sistema_academico.modelo.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TiagoTokugi
 */
public class CursoDAO {
    
    public List<Curso> listar() throws Exception{
            var sql = "SELECT * FROM tb_curso_t3";
            var cursos = new ArrayList <Curso>();
            try (
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);
                var rs = ps.executeQuery();
            ){
                while(rs.next()){
                    var codigo = rs.getInt("cod_curso");
                    var nome = rs.getString("nome");
                    var tipo = rs.getString("tipo");
                    var curso = new Curso(codigo, nome, tipo);
                    cursos.add(curso);
                }
                return cursos;
            }
    }
}
