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
import model.Aluno;
import model.Avaliacao;
import model.Materia;
import model.Professor;
import model.dto.AvaliacaoDTO;

/**
 *
 * @author vanes, Felipe V
 */
public class AvaliacaoDao {
    
    public List<Avaliacao> readAvaliacoesConsult(String AvaliacoesConsult){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Avaliacao> avaliacoes = new ArrayList<>();
       
       try {
          
           //preparado o sql
           stmt = con.prepareStatement("SELECT * FROM tb_avaliacao WHERE data_aplicacao LIKE ?"); 
                   stmt.setString(1, "%"+AvaliacoesConsult+"%");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Avaliacao avaliacao = new Avaliacao();
               
               avaliacao.setId_avaliacao(rs.getInt("id_avaliacao"));
               avaliacao.setData_aplicacao(rs.getString("data_aplicacao"));
               avaliacao.setNota_avaliacao(rs.getDouble("nota_avaliacao"));
               avaliacao.setAprovado(true);
               avaliacao.setEspecificacao(rs.getString("especificacao"));
               
               
               Professor professor = new Professor();
               professor.setId_professor(rs.getInt("tb_professor_id_professor"));
               
               
               
               Aluno aluno = new Aluno();
               aluno.setId_aluno(rs.getInt("tb_aluno_id_aluno"));
               
               
               
               Materia materia = new Materia();
               materia.setId_materia(rs.getInt("tb_materia_id_materia"));
               
               
               
           
               avaliacoes.add(avaliacao);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return avaliacoes;

  }
    
     public void create(AvaliacaoDTO avaliacaoDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("INSERT INTO tb_avaliacao (data_aplicacao, nota_avaliacao, aprovado,especificacao) VALUES (?,?,?,?)");
           stmt.setString(1,avaliacaoDto.getData());
           stmt.setString(2, avaliacaoDto.getNota() );
           stmt.setBoolean(3,true);
           stmt.setString(4,avaliacaoDto.getEspecificacao());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
  public List<Avaliacao> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Avaliacao> avaliacoes = new ArrayList<>();
       
       try {
          
           //preparado o sql
           stmt = con.prepareStatement("Select id_avaliacao, data_aplicacao, "
                   + "nota_avaliacao,aprovado,especificacao, "
                   + "id_professor,id_aluno,id_materia from tb_avaliacao \n" +
"                     inner join tb_professor on tb_avaliacao.tb_professor_id_professor = tb_professor.id_professor\n" +
"                     inner join tb_aluno on tb_avaliacao.tb_aluno_id_aluno = tb_aluno.id_aluno\n" +
"                     inner join tb_materia on tb_avaliacao.tb_materia_id_materia = tb_materia.id_materia");
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Avaliacao avaliacao = new Avaliacao();
               
               avaliacao.setId_avaliacao(rs.getInt("id_avaliacao"));
               avaliacao.setData_aplicacao(rs.getString("data_aplicacao"));
               avaliacao.setNota_avaliacao(rs.getDouble("nota_avaliacao"));
               avaliacao.setAprovado(true);
               avaliacao.setEspecificacao(rs.getString("especificacao"));
               
               
               Professor professor = new Professor();
               professor.setId_professor(rs.getInt("tb_professor_id_professor"));
               avaliacao.setId_professor(professor);
               
               
               Aluno aluno = new Aluno();
               aluno.setId_aluno(rs.getInt("tb_aluno_id_aluno"));
               avaliacao.setId_aluno(aluno);
               
               
               Materia materia = new Materia();
               materia.setId_materia(rs.getInt("tb_materia_id_materia"));
               avaliacao.setId_materia(materia);
               
               
           
               avaliacoes.add(avaliacao);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return avaliacoes;

  }
  
   public ArrayList<Avaliacao> getAvaliacaoByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM tb_avaliacao WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("id_avaliacao")){
                    sql = "SELECT * FROM Avaliacao WHERE " + TpPesquisa + " = ?";
                }
		
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
               
                ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
                
		try {
			//preparado o sql
                        stmt = con.prepareStatement("SELECT data_aplicacao FROM tb_avaliacao");
                        //executa
                        rs = stmt.executeQuery();
           
                        stmt.setObject(1, TpPesquisa);
                        
                        if(TpPesquisa.equals("id_avaliacao")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            stmt.setInt(1, PesquisaInt);
                        } else {
                            stmt.setString(1, Pesquisa);
                        }
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Avaliacao avaliacao = new Avaliacao();
				
				 avaliacao.setId_avaliacao(rs.getInt("id_avaliacao"));
                                 avaliacao.setData_aplicacao(rs.getString("data_aplicacao"));
                                 avaliacao.setNota_avaliacao(rs.getDouble("nota_avaliacao"));
                                 avaliacao.setAprovado(true);
                                 avaliacao.setEspecificacao(rs.getString("especificacao"));
           
                                avaliacoes.add(avaliacao);
			}
		} catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return avaliacoes;

  }
   
    public Avaliacao getAvaliacaoById(int Id){
		String sql = "SELECT * FROM tb_avaliacao WHERE id_avaliacao = ?";
		
		Avaliacao avaliacao = new Avaliacao();
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
		
		
		try {
			
			stmt = (ClientPreparedStatement) con.prepareStatement("SELECT id_avaliacao FROM tb_avaliacao");
			
                        //Só deve retornar 1 registro pois a chave é unica
                        stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                              avaliacao.setId_avaliacao(rs.getInt("id_avaliacao"));
                              avaliacao.setData_aplicacao(rs.getString("data_aplicacao"));
                              avaliacao.setNota_avaliacao(rs.getDouble("nota_avaliacao"));
                              avaliacao.setAprovado(true);
                              avaliacao.setEspecificacao(rs.getString("especificacao"));
           
               
                        }
             
                        }catch (SQLException ex) {
                            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                                ConnectionFactory.closeConnection(con, stmt, rs);
                        }
       
                        return avaliacao;
                            
			}
    
    public void update(AvaliacaoDTO avaliacaoDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("UPDATE tb_avaliacao SET data_aplicacao = ?, nota_avaliacao = ?, aprovado = ?, especificacao = ? WHERE especificacao_avaliacao = ?");
           stmt.setString(1,avaliacaoDto.getData());
           stmt.setString(2, avaliacaoDto.getNota());
           stmt.setBoolean(3,true);
           stmt.setString(4,avaliacaoDto.getEspecificacao());
           stmt.setString(5, avaliacaoDto.getId());
           
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
    public void delete(Avaliacao avaliacao){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("DELETE FROM tb_avaliacao WHERE id_avaliacao = ?");
          
           stmt.setInt(1,avaliacao.getId_avaliacao());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    





}
  
    
    
    

