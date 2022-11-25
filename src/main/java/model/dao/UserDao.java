/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;
import model.UserLogin;
import model.dto.UserDTO;
import view.TelaLogin;


/**
 *
 * @author vanes, Felipe V
 */
public class UserDao {
    
    String login;
    String senha;
    String nome;
    String cpf;
    
    
    public ResultSet autenticacaoUsuario(UserDTO userDTO){
        Connection con = ConnectionFactory.getConnection();
        
        try {
            
            String sql = "SELECT * FROM tb_user where login = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,userDTO.getLogin_user());
            stmt.setString(2,userDTO.getSenha_user());
            
            ResultSet rs = stmt.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" +erro);
            return null;
        }
    }   
    
    public boolean cadastrarUser(UserDTO userDTO){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        String sql = "insert into tb_user(nome, cpf, login, senha) values (?,?,?,?)";
        
        con = new ConnectionFactory().getConnection();
        
        try {
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, userDTO.getNome_cadastro());
            stmt.setString(2, userDTO.getCpf_cadastro());
            stmt.setString(3, userDTO.getLogin_cadastro());
            stmt.setString(4, userDTO.getSenha_cadastro());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
            
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "erro" +erro);
        }
 
        return check;
    }

    public boolean checkLogin(UserDTO userDTO){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       boolean check = false;
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_user WHERE login = ? AND senha = ?");
           stmt.setString(1, login);
           stmt.setString(2,senha);

           //executa
           rs = stmt.executeQuery();
           
          if(rs.next()){
              check = true;
          }else{
              check = false;
          }
           
       } catch (SQLException ex) {
           Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return check;

  }


    public boolean validaUsuario(UserDTO userDTO){
                boolean checkUser = false;
        
                Connection con = null;
		PreparedStatement stmt = null;
                ResultSet rs = null;
		
		try {
			
			stmt = con.prepareStatement("SELECT * FROM tb_user WHERE login = ?");
                        stmt.setString(1,login);
			
			rs = stmt.executeQuery();
                        if(!rs.next()){
                            checkUser = false;
                        } else{
                            checkUser = true;
                        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return checkUser;
    }
    
     public boolean validaNome(UserDTO userDTO){
                boolean checkName = false;
        
                Connection con = null;
		PreparedStatement stmt = null;
                ResultSet rs = null;
		
		try {
			
			stmt = con.prepareStatement("SELECT * FROM tb_user WHERE nome = ?");
                        stmt.setString(1,nome);
			
			rs = stmt.executeQuery();
                        if(!rs.next()){
                            checkName = false;
                        } else{
                            checkName = true;
                        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return checkName;
    }
     
      public boolean validaSenha(UserDTO userDTO){
                boolean checkPass = false;
        
                Connection con = null;
		PreparedStatement stmt = null;
                ResultSet rs = null;
		
		try {
			
			stmt = con.prepareStatement("SELECT * FROM tb_user WHERE senha = ?");
                        stmt.setString(1,senha);
			
			rs = stmt.executeQuery();
                        if(!rs.next()){
                            checkPass = false;
                        } else{
                            checkPass = true;
                        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return checkPass;
    }
      
       public boolean validaCpf(UserDTO userDTO){
                boolean checkCpf = false;
        
                Connection con = null;
		PreparedStatement stmt = null;
                ResultSet rs = null;
		
		try {
			
			stmt = con.prepareStatement("SELECT * FROM tb_user WHERE cpf = ?");
                        stmt.setString(1,cpf);
			
			rs = stmt.executeQuery();
                        if(!rs.next()){
                            checkCpf = false;
                        } else{
                            checkCpf = true;
                        }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
                
                return checkCpf;
    }

  }



