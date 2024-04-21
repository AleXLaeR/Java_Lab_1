package com.example.student_crud_app.controller;


import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
  private final StudentServices studentService;

  public StudentController(StudentServices studentService) {
    this.studentService = studentService;
  }


  @PostMapping("/create-new")
  public ResponseEntity<Student> registerNewStudentHandler(@RequestBody Student student) throws StudentException {
    Student student1 = studentService.registerNewStudent(student);
    return new ResponseEntity<>(student1, HttpStatus.ACCEPTED);
  }


  @GetMapping("/fetch-all")
  public ResponseEntity<List<Student>> getAllStudentHandler() throws StudentException {
    List<Student> students = studentService.getAllStudent();
    return new ResponseEntity<>(students, HttpStatus.OK);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Student> updateStudentBYIDHandler(@PathVariable("id") Long id, @RequestBody Student student) throws StudentException {
    Student students = studentService.updateStudentByID(id, student);
    return new ResponseEntity<>(students, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteStudentBYIDHandler(@PathVariable("id") Long id) throws StudentException {
    String res = studentService.deleteByID(id);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/get-by-id/{id}")
  public ResponseEntity<Student> getStudentBYIDHandler(@PathVariable("id") Long id) throws StudentException {
    Student res = studentService.getStudentByID(id);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }
}
