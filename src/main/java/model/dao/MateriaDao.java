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
import model.Materia;
import model.Turma;
import model.dto.MateriaDTO;

/**
 *
 * @author vanes, Felipe V
 */
public class MateriaDao {
    
    public List<Materia> readMateriasConsult(String MateriasConsult){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Materia> materias = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_materia WHERE nome_materia LIKE ?"); 
                   stmt.setString(1, "%"+MateriasConsult+"%");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Materia materia = new Materia();
               
               materia.setId_materia(rs.getInt("id_materia"));
               materia.setNome_materia(rs.getString("nome_materia"));
               
               Turma turma = new Turma();
               turma.setId_turma(rs.getInt("tb_turma_id_turma"));
               
               materias.add(materia);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return materias;

  }
    
     public void create(MateriaDTO materiaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("INSERT INTO tb_materia(nome_materia) VALUES(?)");
           stmt.setString(1,materiaDto.getNome_materia());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
  public List<Materia> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Materia> materias = new ArrayList<>();
       
       try {
           //preparado o sql
           stmt = con.prepareStatement("select id_materia, nome_materia, id_turma from tb_materia\n" +
"            inner join tb_turma on tb_materia.tb_turma_id_turma = tb_turma.id_turma");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Materia materia = new Materia();
               
               materia.setId_materia(rs.getInt("id_materia"));
               materia.setNome_materia(rs.getString("nome_materia"));
               
               Turma turma = new Turma();
               turma.setId_turma(rs.getInt("tb_turma_id_turma"));
               
               materias.add(materia);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return materias;

  }
  
   public ArrayList<Materia> getMateriaByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM tb_materia WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("id_materia")){
                    sql = "SELECT * FROM Materia WHERE " + TpPesquisa + " = ?";
                }
		
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
               
                ArrayList<Materia> materias = new ArrayList<Materia>();
                
		try {
			//preparado o sql
                        stmt = con.prepareStatement("SELECT nome_materia FROM tb_materia");
                        //executa
                        rs = stmt.executeQuery();
           
                        stmt.setObject(1, TpPesquisa);
                        
                        if(TpPesquisa.equals("id_materia")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            stmt.setInt(1, PesquisaInt);
                        } else {
                            stmt.setString(1, Pesquisa);
                        }
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Materia materia = new Materia();
				
				materia.setId_materia(rs.getInt("id_materia"));
                                materia.setNome_materia(rs.getString("nome_materia"));
                                
                                materias.add(materia);
			}
		} catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return materias;

  }
   
    public Materia getMateriaById(int Id){
		String sql = "SELECT * FROM tb_materia WHERE id_materia = ?";
		
		Materia materia = new Materia();
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
		
		
		try {
			
			stmt = (ClientPreparedStatement) con.prepareStatement("SELECT id_materia FROM tb_materia");
			
                        //Só deve retornar 1 registro pois a chave é unica
                        stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                             materia.setId_materia(rs.getInt("id_materia"));
                             materia.setNome_materia(rs.getString("nome_materia"));
                            
               
                        }
             
                        }catch (SQLException ex) {
                            Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                                ConnectionFactory.closeConnection(con, stmt, rs);
                        }
       
                        return materia;
                            
			}
    
    public void update(MateriaDTO materiaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("UPDATE tb_materia SET nome_materia = ? WHERE nome_materia = ?");
           stmt.setString(1,materiaDto.getNome_materia() );
           stmt.setString(2, materiaDto.getId_materia());
    
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
    public void delete(MateriaDTO materiaDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("DELETE FROM tb_materia WHERE nome_materia = ?");
          
           stmt.setString(1,materiaDto.getNome_materia());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(MateriaDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    





}
  

