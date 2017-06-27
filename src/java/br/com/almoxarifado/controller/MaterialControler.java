/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.controller;




import br.com.almoxarifado.model.MaterialDao;
import br.com.almoxarifado.model.MaterialModel;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;



/**
 *
 * @author Daniel
 */
@ManagedBean
@SessionScoped
public class MaterialControler {
    private MaterialModel mat_mod = new MaterialModel();

    public MaterialControler() {
    }

    public MaterialModel getMat_mod() {
        return mat_mod;
    }

    public void setMat_mod(MaterialModel mat_mod) {
        this.mat_mod = mat_mod;
    }
    
    MaterialDao dao = new MaterialDao();
    public void crear (){
       
          dao.inserir(mat_mod);
        
        
       
       
       
    }
}
