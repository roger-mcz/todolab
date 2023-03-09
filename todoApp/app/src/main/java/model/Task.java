/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author roger
 */
public class Task {
    
    private int id;
    private int project_id;
    private String name;
    private String description;
    private Boolean completed;
    private String notes;
    private LocalDate deadLine;
    private LocalDateTime creationAt;
    private LocalDateTime updatedAt;

    public Task(){
        
    }
    
    public Task(int id, int project_id, String name, String description, Boolean completed, String notes, LocalDate deadLine, LocalDateTime creationAt, LocalDateTime updateAt) {
        this.id = id;
        this.project_id = project_id;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.notes = notes;
        this.deadLine = deadLine;
        this.creationAt = creationAt;
        this.updatedAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public LocalDateTime getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(LocalDateTime creationAt) {
        this.creationAt = creationAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", project_id=" + project_id + ", name=" + name + ", description=" + description + ", completed=" + completed + ", notes=" + notes + ", deadLine=" + deadLine + ", creationAt=" + creationAt + ", updateAt=" + updatedAt + '}';
    }
    
    
}
