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
public class Project {
    
    private int id;
    private String name;
    private String description;
    private Date creationAt;
    private Date updatedAt;

    public Project(int id, String name, String description, Date creationAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationAt = creationAt;
        this.updatedAt = updatedAt;
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

    public Date getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(Date creationAt) {
        this.creationAt = creationAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "project{" + "id=" + id + ", name=" + name + ", description=" + description + ", creationAt=" + creationAt + ", updatedAt=" + updatedAt + '}';
    }

    
}
