/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nandi
 */
public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private ArrayList<Bonus> bonus = new ArrayList<>();
    private String dataAdmissao;

    public Funcionario(String nome, int idade, double salario, String cargo, String dataAdmissao, ArrayList<Bonus> bonus) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.bonus = bonus;
        
    }


    
    public ArrayList<Bonus> getBonus() {
        return bonus;
    }

    public void setBonus(ArrayList<Bonus> bonus) {
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
            
    
}
