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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author roger
 */
public class TaskController {

    public void save(Task task){
        String sql = "INSERT INTO tasks ("
                + "project_id, "
                + "name, "
                + "description, "
                + "completed, "
                + "notes, "
                + "deadLine, "
                + "creationAt, "
                + "updatedAt) VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement stm = null;
        //conexão ao banco e execução do SQL
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);            
            
            stm.setInt(1, task.getProject_id());
            stm.setString(2, task.getName());
            stm.setString(3, task.getDescription());
            stm.setBoolean(4, task.getCompleted());
            stm.setString(5, task.getNotes());
            stm.setDate(6, Date.valueOf(task.getDeadLine()));
            stm.setTimestamp(7, Timestamp.valueOf(task.getCreationAt()));
            stm.setTimestamp(8, Timestamp.valueOf(task.getUpdatedAt()));
            //System.out.println("\n\tstm:" + stm.toString());
            stm.execute();
        } catch (SQLException e) {
            throw new RuntimeException ("Erro ao Salvar tarefa: " + e.getMessage(), e);
        }finally{
            ConnectionFactory.closeConection(conn, stm);
        }
    }
    
    public void update(Task task){
       String sql = "UPDATE INTO tasks SET "
            + "project_id = ?, "
            + "name = ?, "
            + "description = ?, "
            + "completed = ?, "
            + "notes = ?, "
            + "deadLine = ?, "
            + "creationAt = ?, "
            + "updateAt = ?, "
            + "WHERE id = ?";
        Connection conn =null;
        PreparedStatement stm = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);
            stm.setInt(1, task.getProject_id());
            stm.setString(2, task.getName());
            stm.setString(3, task.getDescription());
            stm.setBoolean(4, task.getCompleted());
            stm.setString(5, task.getNotes());
//            stm.setDate(6, new Date(task.getDeadLine().getTime()));
//            stm.setDate(7, new Date(task.getCreationAt().getTime()));
//            stm.setDate(8, new Date(task.getUpdatedAt().getTime()));
            stm.setInt(9, task.getId());
            stm.execute();            
        }  catch (Exception e) {
            throw new RuntimeException ("Erro ao Atualizar tarefa: " + e.getMessage(), e);
        }finally{
            ConnectionFactory.closeConection(conn, stm);
        }
    }
    
    public void removeById(int idTask) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id = ?";        
        Connection conn =null;
        PreparedStatement stm = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);
            stm.setInt(1, idTask);
            stm.execute();                    
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar!");
        } finally{
            ConnectionFactory.closeConection(conn, stm);
        }
        
    }
    
    public List<Task> getAll (int project_id){
        String sql = "SELECT * FROM tasks WHERE project_id = ?";        
        Connection conn =null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Task> tasks = new ArrayList<Task> ();
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(sql);
            stm.setInt(1, project_id);
            rs = stm.executeQuery();
            
            while (rs.next()) {
                Task task = new Task();
                task.setId(rs.getInt("id"));
                task.setProject_id(rs.getInt("project_id"));
                task.setName(rs.getString("name"));
                task.setDescription(rs.getString("description"));
                task.setCompleted(rs.getBoolean("completed"));
                task.setNotes(rs.getString("notes"));
//                task.setDeadLine(rs.getDate("deadLine"));
//                task.setCreationAt(rs.getDate("creationAt"));
//                task.setUpdatedAt(rs.getDate("updateAt"));
                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar dados!");
        } finally{
            ConnectionFactory.closeConection(conn, stm, rs);
        }
        return tasks;
    }
}
