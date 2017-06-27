/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MaterialDao implements DaoGenerico <MaterialModel>{
    private SessionFactory conexao;
    
    public MaterialDao() {
        
        this.conexao=new Configuration().configure().buildSessionFactory();
                
    }
    
    
    @Override
    public void inserir(MaterialModel mat_mod) {
        Session session = null;
        
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(mat_mod);
        tx.commit();
        
        session.close();
        
        
        
        
        
    }
    
    
}
