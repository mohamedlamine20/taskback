package com.example.task.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class TaskTO {
    private  Long id ;
    private String text;
    private String day;
    private boolean reminder ;
    private Long userId;

}
