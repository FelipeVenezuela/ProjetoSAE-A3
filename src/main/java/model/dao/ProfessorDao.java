/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import com.mysql.cj.jdbc.ClientPreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Professor;
import model.dto.ProfessorDTO;

/**
 *
 * @author vanes, Felipe V
 */
public class ProfessorDao {
    
    public List<Professor> readProfessoresConsult(String ProfessoresConsult){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Professor> professors = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_professor WHERE nome_professor LIKE ?"); 
                   stmt.setString(1, "%"+ProfessoresConsult+"%");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Professor professor = new Professor();
               
               professor.setId_professor(rs.getInt("id_professor"));
               professor.setNome_professor(rs.getString("nome_professor"));
               professors.add(professor);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return professors;

  }
    
    public void create(ProfessorDTO professorDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       con = new ConnectionFactory().getConnection();
       
       try {
           stmt = con.prepareStatement("INSERT INTO tb_professor(nome_professor) VALUES(?)");
           stmt.setString(1,professorDto.getNome_cadastro() );
           
           stmt.execute();
           stmt.close();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
  public List<Professor> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Professor> professors = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_professor");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Professor professor = new Professor();
               
               professor.setId_professor(rs.getInt("id_professor"));
               professor.setNome_professor(rs.getString("nome_professor"));
               professors.add(professor);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return professors;

  }
  
   public ArrayList<Professor> getProfessorByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM tb_professor WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("id_professor")){
                    sql = "SELECT * FROM Professor WHERE " + TpPesquisa + " = ?";
                }
		
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
               
                ArrayList<Professor> professors = new ArrayList<Professor>();
                
		try {
			//preparado o sql
                        stmt = con.prepareStatement("SELECT nome_professor FROM tb_professor");
                        //executa
                        rs = stmt.executeQuery();
           
                        stmt.setObject(1, TpPesquisa);
                        
                        if(TpPesquisa.equals("id_professor")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            stmt.setInt(1, PesquisaInt);
                        } else {
                            stmt.setString(1, Pesquisa);
                        }
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Professor professor = new Professor();
				
				professor.setId_professor(rs.getInt("id_professor"));
                                professor.setNome_professor(rs.getString("nome_professor"));
                                
                                professors.add(professor);
			}
		} catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return professors;

  }
   
    public Professor getProfessorById(int Id){
		String sql = "SELECT * FROM tb_professor WHERE id_professor = ?";
		
		Professor professor = new Professor();
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
		
		
		try {
			
			stmt = (ClientPreparedStatement) con.prepareStatement("SELECT id_professor FROM tb_professor");
			
                        //Só deve retornar 1 registro pois a chave é unica
                        stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                             professor.setId_professor(rs.getInt("id_professor"));
                             professor.setNome_professor(rs.getString("nome_professor"));
                            
               
                        }
             
                        }catch (SQLException ex) {
                            Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                                ConnectionFactory.closeConnection(con, stmt, rs);
                        }
       
                        return professor;
                            
			}
    
    public void update(ProfessorDTO professorDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("UPDATE tb_professor SET nome_professor = ? WHERE nome_professor = ?");
           stmt.setString(1,professorDto.getNome_cadastro() );
           stmt.setString(2,professorDto.getId());
    
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
    public void delete(ProfessorDTO professorDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("DELETE FROM tb_professor WHERE nome_professor = ?");
          
           stmt.setString(1,professorDto.getNome_cadastro());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(ProfessorDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    





}
