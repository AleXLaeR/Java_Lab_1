package com.example.student_crud_app.controller;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/mvc")
public class MvcController {
  private final StudentService studentService;

  public MvcController(StudentService studentService) {
    this.studentService = studentService;
  }

  /* http://localhost:8080/mvc/search?name=<ввести_имя> */
  @GetMapping("/search")
  public String searchStudents(
      @RequestParam(name = "name") String name,
      Model model
  ) {
    try {
      List<Student> students = studentService.searchStudentsByName(name);
      if (students.isEmpty()) {
        return "student-search-no-results";
      }

      model.addAttribute("students", students);
      return "student-search-results";
    } catch (StudentException e) {
      model.addAttribute("error", "Error occurred while searching for students");
      return "error-page";
    }
  }
}
