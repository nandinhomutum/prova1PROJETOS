/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.DAO;

import com.UFES.prova1.Model.Cargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nandi
 */
public class CargoDAO {

private static CargoDAO INSTANCE;
 public CargoDAO() {
        
        
        
    }
     public static CargoDAO getCargoDAOInstance() {

        if (INSTANCE == null) {
            INSTANCE = new CargoDAO();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }
    
    public ArrayList<Cargo> getAll() throws SQLException {
        
       String sql = "SELECT * FROM cargo";
       ArrayList<Cargo> lista;
    try (PreparedStatement ps = Conexao.getInstance().connect().prepareStatement(sql)) {
        ResultSet rs = ps.executeQuery();
        lista = new ArrayList<>();
        while(rs.next()){
            
            Cargo cargo = new Cargo();
            cargo.setId(rs.getInt("id"));
            cargo.setNome(rs.getString("nome"));
            lista.add(cargo);
        }
    }
       return lista;
       
       }
}