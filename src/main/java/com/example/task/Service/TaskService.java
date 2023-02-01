package com.example.task.Service;

import com.example.task.Dto.TaskTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    TaskTO getTaskById(Long id);
    List<TaskTO>getALL();
    TaskTO save(TaskTO task);
    Void deleteTaskByid(Long id);

}
