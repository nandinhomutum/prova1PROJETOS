/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.DAO;

import com.UFES.prova1.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nandi
 */
public class FuncionarioDAO {
    private static FuncionarioDAO INSTANCE;
    private Funcionario funcionario;

    public FuncionarioDAO() {
        
        
        
    }
     public static FuncionarioDAO getFuncionarioDAOInstance() {

        if (INSTANCE == null) {
            INSTANCE = new FuncionarioDAO();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }
    
    public void addFuncionario(Funcionario user){
        
        Conexao conexao = (Conexao) new Conexao().connect(); 
        PreparedStatement sql;

        try {
            sql = conexao.connect().prepareStatement("insert into funcionario(idFuncionario, nomeFuncionario, idadeFuncionario, salarioBaseFuncionario, cargo, dataAdmissaoFuncionario) values ('" + user.getNome()+ "','" + user.getSalario()+  "','" + user.getCargo()+ "','" + user.getDataAdmissao()+ "')");
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao inserir os dados ! \n ERRO" + ex);
        } finally {


        }

    }
        
}
