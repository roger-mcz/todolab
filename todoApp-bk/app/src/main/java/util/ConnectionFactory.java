/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author roger
 */
public class ConnectionFactory {
    
    public static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    public static final String URL ="jdbc:mysql://172.17.0.2:3306/todoapp";
    public static final String USER ="root";
    public static final String PASS ="p22ssw00rd";
    
    public static Connection getConnection(){
        try {
            //System.out.println("URL:" + URL + ", user:" + USER + ", pass:" + PASS);
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (Exception e) {
            throw new RuntimeException("Erro de conexao ao banco de dados" + e.getMessage(), e);
        }        
    }
    
    public static void closeConection(Connection conn, PreparedStatement stm){
        try {
            if(conn != null){
                conn.close();
            }
            
            if(stm != null){
                conn.close();
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar conexao!");
        }
    }

    public static void closeConection(Connection conn, PreparedStatement stm, ResultSet rs){
        try {
            if(conn != null){
                conn.close();
            }
            
            if(stm != null){
                stm.close();
            }
            
            if(rs != null){
                rs.close();
            }
            
            

        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar conexao!");
        }
    }


    
}
