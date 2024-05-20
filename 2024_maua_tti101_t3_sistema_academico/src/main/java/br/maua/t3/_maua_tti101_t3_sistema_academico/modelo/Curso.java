/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.t3._maua_tti101_t3_sistema_academico.modelo;

/**
 *
 * @author TiagoTokugi
 */
public class Curso {
    private int id;
    private String nome;
    private String tipo;

    public Curso(int codigo, String nome, String tipo){
        this.id = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
