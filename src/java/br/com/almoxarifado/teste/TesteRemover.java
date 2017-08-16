/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.teste;

import br.com.almoxarifado.controller.MaterialControler;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TesteRemover {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         MaterialControler delMaterial = new MaterialControler();
        
         
         System.out.println("informe o id para deletar ");
         Integer id = sc.nextInt();
         
         delMaterial.delete(id);
         
         System.out.println("deletado com sucesso!!!");

    }

}
