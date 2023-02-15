/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        //conexão ao banco
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);
            stm.setString(1, project.getName());
            stm.setString(2, project.getDescription());
            stm.setDate(3, new Date(project.getCreationAt().getTime()));
            stm.setDate(4, new Date(project.getUpdatedAt() .getTime()));
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
                stm.setDate(3, new Date(project.getCreationAt().getTime()));
                stm.setDate(4, new Date(project.getUpdatedAt().getTime()));
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
                    project.setCreationAt(rs.getDate("creationAt"));
                    project.setUpdatedAt(rs.getDate("updateAt"));
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
