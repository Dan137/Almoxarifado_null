/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

import br.com.almoxarifado.HibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;







public class MaterialDao implements DaoGenerico <MaterialModel>{
    private Session conexao;
    
       
    
    @Override
    public void inserir(MaterialModel mat_mod) {
        this.conexao= HibernateUtil.getSessionFactory().openSession();
        Transaction tx = conexao.beginTransaction();
        conexao.save(mat_mod);
        tx.commit();
        
        conexao.close();
        
        
          
    }
    
    
}
