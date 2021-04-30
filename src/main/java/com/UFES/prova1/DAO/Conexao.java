/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.DAO;

import java.sql.*;

/**
 *
 * @author nandi
 */
public class Conexao {
    
  public static void connect(){
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:bancoDB.db")) {

            System.out.println("Conexão realizada !!!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}