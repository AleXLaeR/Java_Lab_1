package com.example.student_crud_app.services;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student registerNewStudent(Student student) throws StudentException {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() throws StudentException {
        List<Student> studentList = studentRepo.findAll();

        if(studentList.isEmpty()){
            throw new StudentException("No any record founds");
        }
        return studentList;
    }

    @Override
    public Student updateStudentByID(Long id, Student student) throws StudentException {
        Student existingStudent = studentRepo.findById(id).get();
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setStandard(student.getStandard());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setAddress(student.getAddress());
        if(existingStudent != null){
            return studentRepo.save(existingStudent);
        }
        throw new StudentException("Student does not exist with Student ID : "+id);
    }

    @Override
    public String  deleteByID(Long id) throws StudentException {
        Optional<Student> existingStudent = studentRepo.findById(id);

        if(existingStudent.isPresent()){
            studentRepo.deleteById(id);
            return "Student Data Deleted Successfully";
        }
        throw new StudentException("Student does not exist with Student ID : "+id);
    }

    @Override
    public Student getStudentByID(Long id) throws StudentException {

        Optional<Student> student = studentRepo.findById(id);

        if(student.isPresent()) {
            return student.get();
        }
        throw new StudentException("Student does not exist with Student ID : "+id);
    }

    public List<Student> searchStudentsByName(String queriedName) throws StudentException {
        if (queriedName == null || queriedName.isEmpty()) {
            throw new StudentException("Name cannot be empty");
        }
        try {
            List<Student> allStudents = studentRepo.findAll();

            Stream<Student> matchingStudentStream = allStudents.stream().filter((student) -> {
                String studentName = student.getFullName().toLowerCase(Locale.ROOT);
                String searchedName = queriedName.toLowerCase(Locale.ROOT);

                return studentName.contains(searchedName);
            });

            return matchingStudentStream.toList();
        } catch (Exception e) {
            throw new StudentException("Error occurred while searching for students by name : " + e.getMessage());
        }
    }
}
