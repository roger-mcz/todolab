/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author roger
 */
public class Task {
    
    private int id;
    private String name;
    private String description;
    private Boolean completed;
    private String notes;
    private Date deadLine;
    private Date creationAt;
    private Date updateAt;
    private int project_id;

    public Task(int id, String name, String description, Boolean completed, String notes, Date deadLine, Date creationAt, Date updateAt, int project_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.notes = notes;
        this.deadLine = deadLine;
        this.creationAt = creationAt;
        this.updateAt = updateAt;
        this.project_id = project_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(Date creationAt) {
        this.creationAt = creationAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name=" + name + ", description=" + description + ", completed=" + completed + ", notes=" + notes + ", deadLine=" + deadLine + ", creationAt=" + creationAt + ", updateAt=" + updateAt + ", project_id=" + project_id + '}';
    }
    
    
}
