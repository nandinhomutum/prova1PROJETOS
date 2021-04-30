/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Model;

import java.util.Date;

/**
 *
 * @author nandi
 */
public class Bonus {
    private int id;
    private String nome;
    private Date bonus;
     public Bonus(int id, String nome, Date bonus) {
        this.id = id;
        this.nome = nome;
        this.bonus = bonus;
    }

    public Bonus(String nome, Date bonus) {
        this.nome = nome;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getBonus() {
        return bonus;
    }

    public void setBonus(Date bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Bonus{" + "id=" + id + ", nome=" + nome + ", bonus=" + bonus + '}';
    }

}
   
