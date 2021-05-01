
package com.UFES.prova1.DAO;

import com.UFES.prova1.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nandi
 */
public class FuncionarioDAO implements DAOInterface<Funcionario>{
    private static FuncionarioDAO INSTANCE;
    private Funcionario funcionario;
    Connection conn = Conexao.getInstance().connect();

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
    
    @Override
    public Funcionario get(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario get(String str) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Funcionario funcionario) throws SQLException {
        System.out.println(funcionario.getDataAdmissao());
        String sql = "INSERT INTO FUNCIONARIO (nomeFuncionario, idadeFuncionario, salarioBaseFuncionario, cargo, dataAdmissaoFuncionario) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        Date dataAdmissao = java.sql.Date.valueOf(funcionario.getDataAdmissao());
        
        stmt.setString(1, funcionario.getNome().toUpperCase());
        stmt.setInt(2, funcionario.getIdade());
        stmt.setDouble(3, funcionario.getSalario());
        stmt.setString(4, funcionario.getCargo().toUpperCase());
        stmt.setDate(5, (java.sql.Date) dataAdmissao);
        stmt.execute(); 
    }

    @Override
    public void update(Funcionario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Funcionario> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
