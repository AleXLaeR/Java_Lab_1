package com.example.student_crud_app.controller;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/create-new")
  public ResponseEntity<Student> registerNewStudentHandler(
      @RequestBody Student student
  ) throws StudentException {
    Student student1 = studentService.registerNewStudent(student);
    return new ResponseEntity<>(student1, HttpStatus.ACCEPTED);
  }


  @GetMapping("/fetch-all")
  public ResponseEntity<List<Student>> getAllStudentHandler() throws StudentException {
    List<Student> students = studentService.getAllStudent();
    return new ResponseEntity<>(students, HttpStatus.OK);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Student> updateStudentBYIDHandler(
      @PathVariable("id") Long studentId,
      @RequestBody Student student
  ) throws StudentException {
    Student updatedStudent = studentService.updateStudentByID(studentId, student);
    return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteStudentBYIDHandler(
      @PathVariable("id") Long studentId
  ) throws StudentException {
    String response = studentService.deleteByID(studentId);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/get-by-id/{id}")
  public ResponseEntity<Student> getStudentBYIDHandler(
      @PathVariable("id") Long studentId
  ) throws StudentException {
    Student res = studentService.getStudentByID(studentId);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }
}
