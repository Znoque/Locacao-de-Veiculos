/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.*;

/**
 *
 * @author Znoque
 */
public class FabricaDeConexoes {    
    private static final String DRIVER = "com.mysql.jdbc.Driver";//RESPONSÁVEL POR IDENTIFICAR O SERVIÇO DO BANCO DE DADOS
    private static final String CAMINHO = "jdbc:mysql://localhost:3306/db_locacoes";//RESPONSÁVEL POR SETAR O LOCAL DO BANCO DE DADOS
    private static final String USUARIO = "root";
    private static final String SENHA = "vertrigo";
    
    public static Connection conectar(){//MÉTODO RESPONSÁVEL POR REALIZAR A CONEXÃO COM O BANCO
        try {//TENTATIVA INICIAL
            Class.forName(DRIVER);
            return DriverManager.getConnection(DRIVER, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {//EXCESSÃO
            throw new RuntimeException("Erro na conexão", ex);
        }        
    }
    
    public static void desconectar(Connection con){//MÉTODO PARA FECHAR A CONEXÃO COM O BANCO DE DADOS
        if(con != null){
            try {
                con.close();//FECHA A CONEXÃO
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);                
            }
        }        
    }
    
    public static void desconectar(Connection con, PreparedStatement stmt){//MÉTODO PARA FECHAR A CONEXÃO COM O BANCO DE DADOS   
        if(stmt != null){
            try {
                stmt.close();//FECHA A CONEXÃO
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }        
        desconectar(con);        
    }
    
    public static void desconectar(Connection con, PreparedStatement stmt, ResultSet rs){//MÉTODO PARA FECHAR A CONEXÃO COM O BANCO DE DADOS   
        if(rs != null){
            try {
                rs.close();//FECHA A CONEXÃO
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }        
        desconectar(con, stmt);        
    }       
}
