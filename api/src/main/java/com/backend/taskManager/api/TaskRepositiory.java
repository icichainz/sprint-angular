package com.backend.taskManager.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositiory  extends JpaRepository<Task,Long>{
    
}
