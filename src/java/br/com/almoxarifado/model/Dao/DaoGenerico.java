/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model.Dao;

import java.util.List;

/**
 *
 * @author Daniel
 */
public interface DaoGenerico <T> {
    public void inserir (T t);
    
    public void deletar (Integer id);
    
    public List <T> listarTudo ();
    
    public T listarId (Integer id);
    
    public void atualizarId (T t);
}
