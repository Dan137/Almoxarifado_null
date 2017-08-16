/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.teste;

import br.com.almoxarifado.controller.MaterialControler;
import br.com.almoxarifado.model.Dao.MaterialDao;
import br.com.almoxarifado.model.MaterialModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class testeLisTudMateriais {

    public static void main(String[] args) {

        MaterialControler material = new MaterialControler();
        List<MaterialModel> listMat = new ArrayList<>();
        listMat =material.readAll();
        for (int i = 0; i < listMat.size(); i++) {
            
            System.out.println("codigo: " + listMat.get(i).getCodigo());
            System.out.println("Tipo: " + listMat.get(i).getTipo());
            System.out.println("Estado: " + listMat.get(i).getEstado());
            System.out.println("quantidade: " + listMat.get(i).getQuantidade());
            System.out.println("Data de aquisição: " + listMat.get(i).getDataAqui());
            System.out.println("====================================================" );
            
        }
    }

}
