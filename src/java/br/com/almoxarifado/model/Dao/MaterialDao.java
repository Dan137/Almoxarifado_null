/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model.Dao;

import br.com.almoxarifado.HibernateUtil.HibernateUtil;
import br.com.almoxarifado.model.MaterialModel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MaterialDao implements DaoGenerico<MaterialModel> {
    private static MaterialDao instance;
    private Session conexao;
    
    public static MaterialDao getInstance (){
        if (instance == null){
            instance = new MaterialDao();
        }
        return instance;
    }
    
    @Override
    public void inserir(MaterialModel mat_mod) {
        this.conexao = (Session) HibernateUtil.getSessionFactory().openSession();
        Transaction tx = conexao.beginTransaction();
        conexao.save(mat_mod);
        tx.commit();
        conexao.close();

    }

    @Override
    public List<MaterialModel> listarTudo() {
      
       conexao=(Session) HibernateUtil.getSessionFactory().openSession();
       Transaction tx = conexao.beginTransaction();
       Query consult = conexao.createQuery("from MaterialModel");
       List<MaterialModel> mat_mod = consult.list();
       tx.commit();
       conexao.close();
       return mat_mod;
    }

    @Override
    public MaterialModel listarId(Integer id) {
        conexao=(Session) HibernateUtil.getSessionFactory().openSession();
        Transaction tx = conexao.beginTransaction();
        Query consult = conexao.createQuery("from MaterialModel where codigo="+id);
        MaterialModel mat_mod = (MaterialModel) consult.list().get(0);
        tx.commit();
        conexao.close();
        
        return mat_mod;
    }

    @Override
    public void deletar(Integer id) {
        conexao = (Session) HibernateUtil.getSessionFactory().openSession();
        Transaction tx = conexao.beginTransaction();
        Query consult = conexao.createQuery("from MaterialModel where codigo="+ id);
        MaterialModel mat_mod = (MaterialModel) consult.list().get(0);
        conexao.delete(mat_mod);
        tx.commit();
        conexao.close();
    }

    @Override
    public void atualizarId(MaterialModel mat_mod) {
        conexao = (Session) HibernateUtil.getSessionFactory().openSession();
        Transaction tx = conexao.beginTransaction();
        Query consult = conexao.createQuery("from  MaterialModel");
        mat_mod = (MaterialModel) consult.list().get(0);
        conexao.update(mat_mod);
        tx.commit();
        conexao.close();
        
    }


}
