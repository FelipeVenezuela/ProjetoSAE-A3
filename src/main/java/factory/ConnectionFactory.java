
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {

    
    private static final String usuario = "root";
    private static final String senha = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/sae?useTimezone=true&serverTimezone=UTC";
    
   
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            System.out.println("Banco Conectado com sucesso!");
            return DriverManager.getConnection(URL, usuario, senha);
        }catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexão: ",ex);
        }
   
    }
    
    public static void closeConnection(Connection con){
           
        try{
           if(con != null){
               con.close();
           
           }
        }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, "closed connection" , ex);
        }
    
    
    }
    
     public static void closeConnection(Connection con, PreparedStatement stmt){
         
         closeConnection(con);
         
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, "closed connection" , ex);
        } 
    
    }
     
     public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         
         closeConnection(con, stmt);
         
        try{
           if(rs != null){
               rs.close();
           
           }
        }catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, "closed connection" , ex);
        } 
    
    }
     
     public static void main(String[]args){
         ConnectionFactory sf = new ConnectionFactory();
         sf.getConnection();
     
     
     }
    
   
}
   
   //preciso criar o banco de dados SAE no mysql, o método main e testar antes de enviar 
    
     
    

