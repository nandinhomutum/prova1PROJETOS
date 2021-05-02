
package com.UFES.prova1.DAO;

import com.UFES.prova1.Model.Cargo;
import com.UFES.prova1.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        String sql = "SELECT * FROM funcionario WHERE idFuncionario = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if(!rs.next())
             new JOptionPane().showMessageDialog(new JFrame(),"Funcionario Inválido!","Aviso",JOptionPane.WARNING_MESSAGE);
        
        rs = stmt.executeQuery(); 
        Funcionario funcionarioSelecionado = new Funcionario(rs.getInt("idFuncionario"),
                rs.getString("nomeFuncionario"),
                rs.getInt("idadeFuncionario"),
                rs.getDouble("salarioBaseFuncionario"),
                rs.getString("cargo"),
                rs.getString("dataAdmissaoFuncionario"));
        return funcionario;
    }


    @Override
    public void save(Funcionario funcionario) throws SQLException {
        System.out.println(funcionario.getDataAdmissao());
        String sql = "INSERT INTO FUNCIONARIO (nomeFuncionario, idadeFuncionario, salarioBaseFuncionario, cargo, dataAdmissaoFuncionario) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        //LocalDate dataAdmissao = Instant.ofEpochMilli(funcionario.getDataAdmissao()).atZone(ZoneId.systemDefault()).toLocalDate();
        //Date dataAdmissao = java.sql.Date.valueOf(funcionario.getDataAdmissao());
        
        stmt.setString(1, funcionario.getNome().toUpperCase());
        stmt.setInt(2, funcionario.getIdade());
        stmt.setDouble(3, funcionario.getSalario());
        stmt.setString(4, funcionario.getCargo().toUpperCase());
        stmt.setString(5, funcionario.getDataAdmissao());
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
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM FUNCIONARIO");
       while(rs.next()){
         
           funcionarios.add(new Funcionario(rs.getInt("idFuncionario"),
                   rs.getString("nomeFuncionario"),
                   rs.getInt("idadeFuncionario"),
                   rs.getDouble("salarioBaseFuncionario"),
                   rs.getString("cargo"),
                   rs.getString("dataAdmissaoFuncionario")
     
           ));
     
       }
       stmt.close();
       return funcionarios;
       }

        
}
