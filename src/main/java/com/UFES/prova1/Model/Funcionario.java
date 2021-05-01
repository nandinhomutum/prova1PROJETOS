/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
    private ArrayList<Bonus> listaBonus = new ArrayList<>();
    private LocalDateTime dataAdmissao;

    public Funcionario(String nome, int idade, double salario, String cargo, LocalDateTime dataAdmissao, Bonus bonus) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.addBonus(bonus);
    }

    public void addBonus(Bonus bonus) {
        this.listaBonus.add(bonus);
    }
    
    boolean isBonus(Bonus bonus){
        for(Bonus b: listaBonus){
            if(bonus.getNome().equalsIgnoreCase(b.getNome())){
                return true;
            }
        }
        return false;
    }
    
    public void removeBonus(Bonus bonus) {
        this.listaBonus.remove(bonus);
    }

    public ArrayList<Bonus> getListaBonus() {
        return listaBonus;
    }

    public void setListaBonus(ArrayList<Bonus> bonus) {
        this.listaBonus = bonus;
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

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", cargo=" + cargo + ", " + "dataAdmissao=" + dataAdmissao + '}';
    }

}
