/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almoxarifado.model;

import java.util.Calendar;

/**
 *
 * @author Daniel
 */
public class Funcionario {
    private String nome;
    private String telefone;
    private String email;
    private int matricula;
    private Calendar datasaida;
    private Calendar dataadmis;

    public Funcionario(String nome, String telefone, String email, int matricula, Calendar datasaida, Calendar dataadmis) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
        this.datasaida = datasaida;
        this.dataadmis = dataadmis;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Calendar getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(Calendar datasaida) {
        this.datasaida = datasaida;
    }

    public Calendar getDataadmis() {
        return dataadmis;
    }

    public void setDataadmis(Calendar dataadmis) {
        this.dataadmis = dataadmis;
    }
    
    
}
