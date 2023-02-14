/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author roger
 */
public class ConnectionFactory {
    
    public static final String DRIVER ="com.mysql.jdbc.Driver";
    public static final String URL ="jdbc:mysql://172.17.0.2:3306/todoapp";
    public static final String USER ="root";
    public static final String PASS ="p22ssw00rd";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (Exception e) {
            throw new RuntimeException("Erro de conexao ao banco de dados");
        }        
    }
    
    public static void closeConection(Connection con){
        try {
            if(con != null){
                con.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar conexao!");
        }
    }
    
}
