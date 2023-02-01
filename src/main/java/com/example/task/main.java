package com.example.task;

import com.example.task.modules.Task;
import com.example.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class main implements CommandLineRunner {
    @Autowired
    TaskRepository taskRepository;
    @Override
    public void run(String... args) throws Exception {

        Task  task=new Task();
        task.setText("task");
        task.setDay("1/03/2022");
        task.setReminder(true);
        Task  task1=new Task();
        task1.setText("task1");
        task1.setDay("1/03/2022");
        task1.setReminder(true);
        Task  task2=new Task();
        task2.setText("task2");
        task2.setDay("1/03/2022");
        task2.setReminder(true);
        taskRepository.save(task);
        taskRepository.save(task1);
        taskRepository.save(task2);



    }
}
