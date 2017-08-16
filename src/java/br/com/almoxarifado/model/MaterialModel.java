/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
    private Date dataAqui;
    @Column(length=50)
    private String estado;
    private int quantidade;

    /**
     * @return the codigo
     */
    public MaterialModel() {
    }
    public MaterialModel(String tipo, String estado, int quantidade){
        this.tipo=tipo;
        this.estado=estado;
        this.quantidade=quantidade;
    }
     
    public MaterialModel(String tipo, String estado, int quantidade, Date dataAqui) {
        this.tipo=tipo;
        this.estado=estado;
        this.quantidade=quantidade;
        this.dataAqui=dataAqui;
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
//    public static MaterialModel convertDataAquisicao(MaterialModel mat_mod){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        String date = sdf.format(mat_mod.dataAqui);
//        Date data;
//        try {
//            data = sdf.parse(date);
//            mat_mod.setDataAqui(data);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return mat_mod;
//    }


}
