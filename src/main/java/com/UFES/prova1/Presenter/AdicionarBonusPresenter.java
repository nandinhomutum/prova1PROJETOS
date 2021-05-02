/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.Presenter;

import com.UFES.prova1.Model.Funcionario;
import com.UFES.prova1.View.TelaFuncionarioBonusView;

/**
 *
 * @author nandi
 */
public class AdicionarBonusPresenter {

    private TelaFuncionarioBonusView view;

    public AdicionarBonusPresenter(Funcionario funcionario) {
        ConfigurarTela();
        preencherTela(funcionario);
        
    }
    
    private void ConfigurarTela(){
        this.view = new TelaFuncionarioBonusView();
        view.setVisible(true);
    }

    private void preencherTela(Funcionario funcionario) {
        view.getLblNome().setText(funcionario.getNome());
        view.getLblCargo().setText(funcionario.getNome());
        view.getLblDataAdmissao().setText(funcionario.getDataAdmissao());
        //view.getLblBonus().setText(funcionario.getListaBonus());
        //view.getLblCargo().setText(funcionario.getNome());
        //view.getLbId().setLabelFor(funcionario.getId());
        
    }
    
}
