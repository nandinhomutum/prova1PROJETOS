/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Presenter;

import com.UFES.prova1.DAO.FuncionarioDAO;
import com.UFES.prova1.Model.Funcionario;
import com.UFES.prova1.View.TelaManterFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nandi
 */
public class ManterFuncionarioPresenter {
    TelaManterFuncionarioView view;
    
    public ManterFuncionarioPresenter(){
        configurarTela();
        
    view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
          public void actionPerformed(ActionEvent ae) {
                   view.dispose();
            } 
        });
    view.getBtnExcluir().addActionListener(new ActionListener() {
            @Override
          public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
    
    view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
          public void actionPerformed(ActionEvent ae) {
                   cadastrarFuncionario();
                   new BuscarFuncionarioPresenter();
                   view.dispose();
            } 
        });
    
    view.getBtnEditar().addActionListener(new ActionListener() {
            @Override
          public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
 
    
    }
    
    private void configurarTela(){
        this.view = new TelaManterFuncionarioView();
        this.view.setVisible(true);
       
    
    }
    
    
    public void cadastrarFuncionario(){
     
        String nome = view.getTxtNome().getText();
        int idade = Integer.parseInt(view.getTxtIdade().getText());
        float salario = Float.parseFloat(view.getTxtSalario().getText());
        String cargo = view.getCbCargo().getSelectedItem().toString();
        String bonus = view.getCbBonus().getSelectedItem().toString();
        String dataAdmissao = view.getTxtAdmissao().getText();
        
        Funcionario funcionario = new Funcionario(nome, idade, salario, cargo, dataAdmissao, bonus);
        FuncionarioDAO.getFuncionarioDAOInstance().addFuncionario(funcionario);
    }
}
