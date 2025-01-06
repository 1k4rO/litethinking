package com.litethinking.students.controller;

import com.litethinking.students.domain.Student;
import com.litethinking.students.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PutMapping(path="/students/{id}")
    public ResponseEntity<Student> createStudent(@PathVariable("id") String id, @RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping(path="/students/")
    public List<Student> listStudents(@RequestParam(required = false) String name,
                                      @RequestParam(required = false) String cellNumber) {
        if (name != null && !(name.trim().isEmpty())) {
            return studentService.getStudentsByName(name);
        } else if (cellNumber != null && !(cellNumber.trim().isEmpty())) {
            return studentService.getStudentsByCellNumber(cellNumber);
        } else{
            return studentService.getStudents();
        }
    }

    @GetMapping(path = "/students/orderedByGpa")
    public List<Student> listStudentsOrderedByGpa() {
        return studentService.getStudentsOrderedByGpa();
    }


}
