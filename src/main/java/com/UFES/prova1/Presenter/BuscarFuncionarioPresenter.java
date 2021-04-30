/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Presenter;

import com.UFES.prova1.View.TelaBuscarFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nandi
 */
public class BuscarFuncionarioPresenter {
    
    private TelaBuscarFuncionarioView view;
    
    public BuscarFuncionarioPresenter(){
        ConfigurarTela();
        
      view.getBtnFechar().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   view.dispose();
            } 
        });
      
      view.getBtnBonus().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
      
      view.getBtnBuscar().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
      
      view.getBtnNovo().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   new ManterFuncionarioPresenter();
            } 
        });
      
      view.getBtnVisualizar().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
    }
    
    
    private void ConfigurarTela(){
        this.view = new TelaBuscarFuncionarioView();
        view.setVisible(true);
    }
    
}
