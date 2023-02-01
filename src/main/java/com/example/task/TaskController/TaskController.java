package com.example.task.TaskController;

import com.example.task.modules.Task;
import com.example.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:4200/")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        Task task=taskRepository.findById(id).get();
        task.setText("hhhjhhhh");

        return task;
    }
    @PatchMapping("/") public  Task updatett(@RequestParam("te") String te){
        Task task=   taskRepository.getById(1L);
        task.setText(te);
        return task;
    }
    @PostMapping()
    public Task addTask(@RequestBody Task task){
        return taskRepository.save(task);

    }  @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
         taskRepository.deleteById(id);

    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable("id") Long id ,@RequestBody Task task){
        Task task1=taskRepository.findById(id).get();
        task1.setReminder(task.isReminder());
        return taskRepository.save(task1);
    }

    @GetMapping("/all")
    public List<Task>getAll(){
        return taskRepository.findAll();
    }


}
