package com.example.task.Service;

import com.example.task.Dto.TaskTO;
import com.example.task.modules.Task;
import com.example.task.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService{



    @Autowired
   private final TaskRepository taskRepository;

    @Override
    public TaskTO getTaskById(Long id) {
        Task task= taskRepository.getById(id);
        return new TaskTO(task.getId(),task.getText(),task.getDay(),task.isReminder(),1L);
    }

    @Override
    public List<TaskTO> getALL() {
        return null;
    }

    @Override
    public TaskTO save(TaskTO task) {
        return null;
    }

    @Override
    public Void deleteTaskByid(Long id) {
        return null;
    }
}
