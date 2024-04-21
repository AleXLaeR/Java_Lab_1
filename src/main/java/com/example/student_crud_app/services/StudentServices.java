package com.example.student_crud_app.services;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;

import java.util.List;

public interface StudentServices {
    public Student registerNewStudent(Student student) throws StudentException;
    public List<Student> getAllStudent() throws StudentException;
    public Student updateStudentByID(Long id, Student student) throws StudentException;
    public String  deleteByID(Long id) throws StudentException;
    public Student  getStudentByID(Long id) throws StudentException;
}
