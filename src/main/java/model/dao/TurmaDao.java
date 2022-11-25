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
import model.Turma;
import model.dto.ProfessorDTO;
import model.dto.TurmaDTO;

/**
 *
 * @author vanes, Felipe V
 */
public class TurmaDao {
    
    public List<Turma> readTurmasConsult(String TurmasConsult){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Turma> turmas = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_turma WHERE nome_turma LIKE ?"); 
                   stmt.setString(1, "%"+TurmasConsult+"%");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Turma turma = new Turma();
               
               turma.setId_turma(rs.getInt("id_turma"));
               turma.setNome_turma(rs.getString("nome_turma"));
               turma.setPeriodo(rs.getString("periodo"));
               
               Professor professor = new Professor();
               professor.setId_professor(rs.getInt("tb_professor_id_professor"));
               
               
               turmas.add(turma);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return turmas;

  }
    
    public void create(TurmaDTO turmaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("INSERT INTO tb_turma (nome_turma, periodo) VALUES (?,?)");
           stmt.setString(1,turmaDto.getNomeTurma_cadastro() );
           stmt.setString(2,turmaDto.getPeriodo_cadastro());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
  public List<Turma> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Turma> turmas = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("select id_turma, nome_turma,periodo, id_professor from tb_turma \n" +
"            inner join tb_professor on tb_turma.tb_professor_id_professor = tb_professor.id_professor");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Turma turma = new Turma();
               
               turma.setId_turma(rs.getInt("id_turma"));
               turma.setNome_turma(rs.getString("nome_turma"));
               turma.setPeriodo(rs.getString("periodo"));
               
               Professor professor = new Professor();
               professor.setId_professor(rs.getInt("tb_professor_id_professor"));
               
               
               turmas.add(turma);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return turmas;

  }
  
   public ArrayList<Turma> getTurmaByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM tb_turma WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("id_turma")){
                    sql = "SELECT * FROM Turma WHERE " + TpPesquisa + " = ?";
                }
		
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
               
                ArrayList<Turma> turmas = new ArrayList<Turma>();
                
		try {
			//preparado o sql
                        stmt = con.prepareStatement("SELECT nome_turma FROM tb_turma");
                        //executa
                        rs = stmt.executeQuery();
           
                        stmt.setObject(1, TpPesquisa);
                        
                        if(TpPesquisa.equals("id_turma")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            stmt.setInt(1, PesquisaInt);
                        } else {
                            stmt.setString(1, Pesquisa);
                        }
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Turma turma = new Turma();
				
				turma.setId_turma(rs.getInt("id_turma"));
                                turma.setNome_turma(rs.getString("nome_turma"));
                                turma.setPeriodo(rs.getString("periodo"));
                                
                                turmas.add(turma);
			}
		} catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return turmas;

  }
   
    public Turma getTurmaById(int Id){
		String sql = "SELECT * FROM tb_turma WHERE id_turma = ?";
		
		Turma turma = new Turma();
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
		
		
		try {
			
			stmt = (ClientPreparedStatement) con.prepareStatement("SELECT id_turma FROM tb_turma");
			
                        //Só deve retornar 1 registro pois a chave é unica
                        stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                             turma.setId_turma(rs.getInt("id_turma"));
                             turma.setNome_turma(rs.getString("nome_turma"));
                             turma.setPeriodo(rs.getString("periodo"));
                            
               
                        }
             
                        }catch (SQLException ex) {
                            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                                ConnectionFactory.closeConnection(con, stmt, rs);
                        }
       
                        return turma;
                            
			}
    
    public void update(TurmaDTO turmaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("UPDATE tb_turma SET nome_turma = ?, periodo = ? WHERE nome_turma = ?");
           stmt.setString(1,turmaDto.getNomeTurma_cadastro());
           stmt.setString(2,turmaDto.getPeriodo_cadastro());
           stmt.setString(3, turmaDto.getId_turma());
    
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
    public void delete(TurmaDTO turmaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("DELETE FROM tb_turma WHERE nome_turma = ?");
          
           stmt.setString(1,turmaDto.getNomeTurma_cadastro());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    





    
}
