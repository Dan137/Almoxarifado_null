/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.teste;

import br.com.almoxarifado.controller.MaterialControler;
import br.com.almoxarifado.model.Dao.MaterialDao;
import br.com.almoxarifado.model.MaterialModel;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TesteAtualizaMaterial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaterialControler updMat = new MaterialControler();
        MaterialModel mat_mod = new MaterialModel();
        List<MaterialModel> listMaterial;
        listMaterial = updMat.readAll();
        
        String tipo;
        String estado;
        int quantidade;

        System.out.println("informe o novo tipo");
        tipo = sc.next();

        System.out.println("informe o novo estado");
        estado = sc.next();

        System.out.println("informe a quantidade");
        quantidade = sc.nextInt();

        System.out.println("informe o id para atualização");
        Integer id = sc.nextInt();
       /* como faço para atualizar a data em java*/
//        System.out.println("informe o data");
        for (int i = 0; i < listMaterial.size(); i++) {
            if (listMaterial.get(i).getCodigo() == id) {
                mat_mod = listMaterial.get(i);
                mat_mod.setTipo(tipo);
                mat_mod.setEstado(estado);
                mat_mod.setQuantidade(quantidade);
//                porque eu não consigo chamar este método
                updMat.update(mat_mod);

            }
        }
    }
}

    