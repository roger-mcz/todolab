/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author roger
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome", "Descrição", "Prazo", "Atualizado em:", "Tarefa concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();
    
    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 4;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(tasks.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");        
        LocalDate localDateConvert = null;
        LocalDateTime localDateTimeConvert = null;
        
        switch(columnIndex){
            case 0:
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();            
            case 2:
                localDateConvert = tasks.get(rowIndex).getDeadLine();
                return localDateConvert.format(localDateFormatter);
            case 3:
                localDateTimeConvert = tasks.get(rowIndex).getUpdatedAt();
                return localDateTimeConvert.format(localDateTimeFormatter);
            case 4:
                return tasks.get(rowIndex).getCompleted();
            case 5:
                return "";                
            case 6:
                return "";                
            default:
                return "Dados não encontrados.";
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        tasks.get(rowIndex).setCompleted((boolean) aValue);
        
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
    
}
