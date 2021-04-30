/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Presenter;

import com.UFES.prova1.View.TelaCalcularSalarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nandi
 */
public class SalarioPresenter {
    
    private TelaCalcularSalarioView view;
    
    public SalarioPresenter(){
        configurarTela();
    
      view.getBtnFechar().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   view.dispose();
            } 
        });
      
      view.getBtnBuscar().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
      view.getBtnCalculo().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
      view.getBtnDataCalculo().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
      
      view.getBtnListarTodos().addActionListener(new ActionListener() {
           
           public void actionPerformed(ActionEvent ae) {
                   //view.dispose();
            } 
        });
    }
    private void configurarTela(){
        this.view = new TelaCalcularSalarioView();
        this.view.setVisible(true);
    }
    
}
