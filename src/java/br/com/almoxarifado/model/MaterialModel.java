/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private String descricao;
    @Column(length=50)
    private String estado;
    private Calendar dataAqui;

    /**
     * @return the codigo
     */
    public MaterialModel() {
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    /**
     * @return the dataAqui
     */
    public Calendar getDataAqui() {
        return dataAqui;
    }

    /**
     * @param dataAqui the dataAqui to set
     */
    public void setDataAqui(Calendar dataAqui) {
        this.dataAqui = dataAqui;
    }

}
