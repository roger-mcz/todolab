/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author roger
 */
public class ProjectController {
 
    public void save(Project project){
        String sql = "INSERT INTO projects ("
                + "name, "
                + "description, "
                + "creationAt, "
                + "updatedAt) VALUES(?,?,?,?)";
        Connection conn = null;
        PreparedStatement stm = null;
        //conexão ao banco e execução do SQL
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);
            stm.setString(1, project.getName());
            stm.setString(2, project.getDescription());
            stm.setTimestamp(3, Timestamp.valueOf(project.getCreationAt()));
            stm.setTimestamp(4, Timestamp.valueOf(project.getUpdatedAt()));
            stm.execute();
        }catch (Exception e) {
            throw new RuntimeException ("Erro ao Salvar o projeto: " + e.getMessage(), e);
        }finally{
           ConnectionFactory.closeConection(conn, stm);
        }
    }
    
    
    
        public void update(Project project){
            String sql = "UPDATE INTO projects SET "
                + "name, "
                + "description, "
                + "creationAt, "
                + "updatedAt, "
                + "WHERE id = ?";
            Connection conn =null;
            PreparedStatement stm = null;
            //conexão ao banco        
            try {
                conn = ConnectionFactory.getConnection();
                stm = conn.prepareStatement(sql);
                stm.setString(1, project.getName());
                stm.setString(2, project.getDescription());
                stm.setTimestamp(3, Timestamp.valueOf(project.getCreationAt()));
                stm.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                stm.setInt(5, project.getId());
                stm.execute();            
            }catch (Exception e) {
                throw new RuntimeException ("Erro ao Atualizar projeto: " + e.getMessage(), e);
            }finally{
                ConnectionFactory.closeConection(conn, stm);
            }
        }

        public void removeById(int idProject) throws SQLException{
            String sql = "DELETE FROM projetos WHERE id = ?";        
            Connection conn =null;
            PreparedStatement stm = null;
            //conexão ao banco        
            try {
                conn = ConnectionFactory.getConnection();
                stm = conn.prepareStatement(sql);
                stm.setInt(1, idProject);
                stm.execute();                    
            }catch (Exception e) {
                throw new RuntimeException("Erro ao deletar!");
            }finally{
                ConnectionFactory.closeConection(conn, stm);
            }
        }

        public List<Project> getAll (){
            String sql = "SELECT * FROM projects";        
            Connection conn =null;
            PreparedStatement stm = null;
            ResultSet rs = null;
            List<Project> projects = new ArrayList<Project> ();
            try {
                conn = ConnectionFactory.getConnection();
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                //conexão ao banco        
                while (rs.next()) {
                    Project project = new Project();
                    project.setId(rs.getInt("id"));
                    project.setName(rs.getString("name"));
                    project.setDescription(rs.getString("description"));
                    project.setCreationAt(rs.getTimestamp("creationAt").toLocalDateTime());
                    project.setUpdatedAt(rs.getTimestamp("updateAt").toLocalDateTime());
                    projects.add(project);
                }
            } catch (Exception e) {
                throw new RuntimeException("Erro ao listar dados!");
            } finally{
                ConnectionFactory.closeConection(conn, stm, rs);
            }
            return projects;
        }

        
        
}
