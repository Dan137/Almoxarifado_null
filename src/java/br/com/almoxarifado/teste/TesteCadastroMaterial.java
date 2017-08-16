/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.teste;

import br.com.almoxarifado.controller.MaterialControler;
import br.com.almoxarifado.model.Dao.MaterialDao;
import br.com.almoxarifado.model.MaterialModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TesteCadastroMaterial {
    public static void main(String[] args) throws ParseException {
        MaterialControler materialControler = new MaterialControler();
        MaterialModel mat_mod;
        String tipo="";
        int op=0;
        String estado="";
        int quantidade=0;
        String dataAqui ;
        Scanner sc = new Scanner (System.in);
        System.out.println("informe o tipo do material");
        tipo=sc.next();
        
        System.out.println("informe o estado do material"
                + "1- em uso"
                + "2- emprestado"
                + "3- em manutencao");
        op= sc.nextInt();
        switch(op){
            case 1:
                estado="em uso";
                break;
            case 2:
                estado="emprestado";
                break;
            case 3: 
                estado="em manutencao";
        }
        
        
        System.out.println("informe a data de aquisição do material");
        dataAqui = sc.next();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
	Date dt = df.parse(dataAqui);
        
        System.out.println("informe a quantidade do material");
        quantidade=sc.nextInt();
        mat_mod = new MaterialModel(tipo, estado, quantidade, dt);
        MaterialDao.getInstance().inserir(mat_mod);
    }
}
