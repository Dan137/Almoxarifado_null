/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.controller;

import br.com.almoxarifado.model.Dao.MaterialDao;
import br.com.almoxarifado.model.MaterialModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Daniel
 */
@ManagedBean(name = "materialBean")
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

    

    public void crear() {

        MaterialDao.getInstance().inserir(mat_mod);

    }
    public List <MaterialModel> readAll(){
        List <MaterialModel> listMat= MaterialDao.getInstance().listarTudo();
        
        return listMat;
    }
    public MaterialModel readId (Integer id){
        this.mat_mod = MaterialDao.getInstance().listarId(id);
        return mat_mod;
    }
    public void delete (Integer id){
        MaterialDao.getInstance().deletar(id);
     }
    public void update (MaterialModel mat_mod){
      MaterialDao.getInstance().atualizarId(mat_mod);
    }
}
