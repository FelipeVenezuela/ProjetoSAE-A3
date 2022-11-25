
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
import model.Turma;
import model.dto.AlunoDTO;

/*
 * @author Felipe V
 */
public class AlunoDao {
    
    
    public List<Aluno> readAlunosConsult(String AlunosConsult){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;

       List<Aluno> alunos = new ArrayList<>();

       try {
           //preparado o sql
                   stmt = con.prepareStatement("SELECT * FROM tb_aluno WHERE nome_aluno LIKE ?"); 
                   stmt.setString(1, "%"+AlunosConsult+"%");
           //executa
           rs = stmt.executeQuery();

           while(rs.next()){
               Aluno aluno = new Aluno();

               aluno.setId_aluno(rs.getInt("id_aluno"));
               aluno.setNome_aluno(rs.getString("nome_aluno"));
               aluno.setMedia(rs.getDouble("media"));
               aluno.setSituacao(rs.getString("situacao"));

               Turma turma = new Turma();
               turma.setId_turma(rs.getInt("tb_turma_id_turma"));
               

               alunos.add(aluno);
           }

       } catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
      return alunos;
    }
    
   public void create(AlunoDTO alunoDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("INSERT INTO tb_aluno(nome_aluno, media, situacao) VALUES (?,?,?)");
           stmt.setString(1,alunoDto.getNome_aluno());
           stmt.setString(2, alunoDto.getMedia_aluno());
           stmt.setString(3, alunoDto.getSituacao_aluno());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
  public List<Aluno> read(){
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Aluno> alunos = new ArrayList<>();
       
       try {
           //preparado o sql
                   stmt = con.prepareStatement("select id_aluno,nome_aluno,"
                   + " media, situacao,id_turma from tb_aluno inner "
                   + "join tb_turma on tb_aluno.tb_turma_id_turma = tb_turma.id_turma"); 
           //executa
           rs = stmt.executeQuery();
           
           while(rs.next()){
               Aluno aluno = new Aluno();
               
               aluno.setId_aluno(rs.getInt("id_aluno"));
               aluno.setNome_aluno(rs.getString("nome_aluno"));
               aluno.setMedia(rs.getDouble("media"));
               aluno.setSituacao(rs.getString("situacao"));
               
               Turma turma = new Turma();
               turma.setId_turma(rs.getInt("tb_turma_id_turma"));
               aluno.setId_turma(turma);
               
               alunos.add(aluno);
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return alunos;

  }
  
   public ArrayList<Aluno> getAlunoByName(String Pesquisa, String TpPesquisa){
		String sql = "SELECT * FROM tb_aluno WHERE " + TpPesquisa + " LIKE ?";
                if(TpPesquisa.equals("id_aluno")){
                    sql = "SELECT * FROM Aluno WHERE " + TpPesquisa + " = ?";
                }
		
		Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
               
                ArrayList<Aluno> alunos = new ArrayList<Aluno>();
                
		try {
			//preparado o sql
                        stmt = con.prepareStatement("SELECT nome_aluno FROM tb_aluno");
                        //executa
                        rs = stmt.executeQuery();
           
                        stmt.setObject(1, TpPesquisa);
                        
                        if(TpPesquisa.equals("id_aluno")){
                            Pesquisa = Pesquisa.replace("%", "");
                            int PesquisaInt = Integer.parseInt(Pesquisa);
                            stmt.setInt(1, PesquisaInt);
                        } else {
                            stmt.setString(1, Pesquisa);
                        }
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Aluno aluno = new Aluno();
				
				 aluno.setId_aluno(rs.getInt("id_aluno"));
                                 aluno.setNome_aluno(rs.getString("nome_aluno"));
                                 aluno.setSituacao(rs.getString("situacao"));
                                alunos.add(aluno);
			}
		} catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
       
       return alunos;

  }
   
    public Aluno getAlunoById(int Id){
		String sql = "SELECT * FROM tb_aluno WHERE id_aluno = ?";
		
		Aluno aluno = new Aluno();
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
		
		
		try {
			
			stmt = (ClientPreparedStatement) con.prepareStatement("SELECT id_aluno FROM tb_aluno");
			
                        //Só deve retornar 1 registro pois a chave é unica
                        stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                              aluno.setId_aluno(rs.getInt("id_aluno"));
                              aluno.setNome_aluno(rs.getString("nome_aluno"));
                              aluno.setSituacao(rs.getString("situacao"));
               
                        }
             
                        }catch (SQLException ex) {
                            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
                        }finally{
                                ConnectionFactory.closeConnection(con, stmt, rs);
                        }
       
                        return aluno;
                            
			}
    
    public void update(AlunoDTO alunoDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("UPDATE tb_aluno SET nome_aluno = ?, media = ?, situacao = ? WHERE nome_aluno = ?");
           stmt.setString(1,alunoDto.getNome_aluno() );
           stmt.setString(2, alunoDto.getMedia_aluno());
           stmt.setString(3, alunoDto.getSituacao_aluno());
           stmt.setString(4,alunoDto.getId_aluno());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
    public void delete(AlunoDTO alunoDto){
       //abre a conexão
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       try {
           stmt = con.prepareStatement("DELETE FROM tb_aluno WHERE nome_aluno = ?");
          
           stmt.setString(1,alunoDto.getNome_aluno());
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
       } catch (SQLException ex) {
           Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir!!" + ex);
       }finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    





}
  
  
   

