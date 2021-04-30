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
    

  private Connection conn;

    Conexao() {
    }

    public static Conexao getInstance() {
        return NewSingletonHolder.INSTANCE;
    }

    private static class NewSingletonHolder {

        private static final Conexao INSTANCE = new Conexao();
    }

    public Connection connect() {
        if (null == this.getConn()) {
            try {
                // db parameters  
                String url = "jdbc:sqlite:bancoDB.db";
                // create a connection to the database  
                this.conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return this.conn;
    }
    
    public void disconect(){
        if (null != this.getConn()) {        
            try {                
              conn.close();
              System.out.println("Disconected from SQLite.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public Connection connect(String url) {
        if (null == this.getConn()) {
            try {
                // db parameters                  
                // create a connection to the database  
                this.conn = DriverManager.getConnection(url);

                System.out.println("Connection established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return this.conn;
    }

    private Connection getConn() {
        return conn;
    }
}