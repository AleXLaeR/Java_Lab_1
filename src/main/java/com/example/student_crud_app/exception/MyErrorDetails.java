package com.example.student_crud_app.exception;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MyErrorDetails {
    private LocalDateTime timeStamp;
    private String details;
    private String message;
}
