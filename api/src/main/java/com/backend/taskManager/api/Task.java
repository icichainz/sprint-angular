package com.backend.taskManager.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    
    @Column(nullable = false)
    private String title ;

    @Column(nullable = false)
    private boolean completed  = false;

    public Long getId(){
        return this.id ;
    }

    public void setId(Long id){
        this.id = id ;
    }

    public String getTitle(){
        return this.title ;
    }

    public void setTitle(String title){
        this.title = title ;
    }

    public boolean getCompleted(){
     return this.completed ;
    }

    public void setCompleted(boolean completed){
     this.completed = completed ;
    }

}
