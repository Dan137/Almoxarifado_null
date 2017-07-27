/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "material")
public class MaterialModel implements Serializable {

    @Id
    @GeneratedValue
    private Integer codigo;
    @Column(length=50)
    private String tipo;
    
    @Column(length=50)
    private String estado;
   
    private Date dataAqui;
    private int quantidade;

    /**
     * @return the codigo
     */
    public MaterialModel() {
    }
    
    
    public MaterialModel(Integer codigo, String tipo, String estado, Date dataAqui, int quantidade) {
        this.codigo=codigo;
        this.tipo=tipo;
        this.estado=estado;
        this.dataAqui=dataAqui;
        this.quantidade=quantidade;
        
    }
    
    public Date getDataAqui() {
        return dataAqui;
    }

    public void setDataAqui(Date dataAqui) {
        this.dataAqui = dataAqui;
    }
    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    

}
