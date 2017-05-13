/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

/**
 *
 * @author Daniel
 */
public class Material {
    
    private String tipo;
    private int id;
    private int quantidade;

    public Material(String tipo, int id, int quantidade) {
        this.tipo = tipo;
        this.id = id;
        this.quantidade = quantidade;
        
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
