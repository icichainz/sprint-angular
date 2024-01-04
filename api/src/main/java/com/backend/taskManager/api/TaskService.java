package com.backend.taskManager.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepositiory taskRepositiory;

    public List<Task> getAllTasks() {
        return taskRepositiory.findAll();
    }

    public Task createTask(Task task) {
        
        return taskRepositiory.save(task);
    }

    public Task getTaskById(Long id) {
        return taskRepositiory.findById(id)
                .orElseThrow();
    }

    public Task updateTask(Long id, Task task) {
        Task existingTask = getTaskById(id);
    
        existingTask.setTitle(task.getTitle() );
        existingTask.setCompleted(task.getCompleted());
        // update other fields
        return taskRepositiory.save(existingTask);
        
    }

    public void deleteTask(Long id){
        taskRepositiory.deleteById(id);
    }

}
