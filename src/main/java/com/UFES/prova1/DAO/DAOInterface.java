/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UFES.prova1.DAO;

import java.sql.SQLException;
import java.util.ArrayList;


public interface DAOInterface<T> {       

    public T get(int id) throws SQLException;
	
    public void save(T obj) throws SQLException;
	
    public void update(T obj) throws SQLException;

    public void delete(int id) throws SQLException;

    public ArrayList<T> getAll() throws SQLException;
}
