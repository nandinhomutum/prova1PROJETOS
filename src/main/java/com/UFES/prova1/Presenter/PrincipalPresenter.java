/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Presenter;

import com.UFES.prova1.View.TelaPrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nandi
 */
public class PrincipalPresenter {
    
    private TelaPrincipalView view;
    
    public PrincipalPresenter(){
        configurarTela();
     
        

     view.getMenuBuscarFuncionario().addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent ae) {
                   new BuscarFuncionarioPresenter();
            } 
        });
 
     view.getMenuCalcularSalario().addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent ae) {
                   new SalarioPresenter();
            } 
        });        
      
  
    }
             
    private void configurarTela(){
        this.view = new TelaPrincipalView();
        this.view.setVisible(true);
       
    
    }
    
}
