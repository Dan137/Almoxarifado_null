/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.teste;

import br.com.almoxarifado.controller.MaterialControler;
import br.com.almoxarifado.model.MaterialModel;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TesteListIdMater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaterialControler idMaterial = new MaterialControler();
        MaterialModel mat_mod = new MaterialModel();
        
        System.out.println("digite o id");
        Integer id = sc.nextInt();
        mat_mod=idMaterial.readId(id);
        
        if (id==mat_mod.getCodigo()){
            System.out.println("codigo: "+mat_mod.getCodigo());  
            System.out.println("tipo: "+mat_mod.getTipo());  
            System.out.println("estado: "+mat_mod.getEstado());
            System.out.println("estado: "+mat_mod.getQuantidade());
            System.out.println("data de aquisição: "+mat_mod.getDataAqui());
        }
    }
}
