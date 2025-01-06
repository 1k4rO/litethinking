package com.litethinking.students.service;

import com.litethinking.students.repositories.StudentRepository;
import com.litethinking.students.domain.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //List all active students
    public ArrayList<Student> getStudents() {
        return studentRepository.listActiveStudents();
    }

    //Filter active students by name
    public List<Student> getStudentsByName(String name) {
        return studentRepository.listActiveStudents().stream().filter(x -> x.getName().equals(name)).toList();
    }

    //Filter active students by cellNumber
    public List<Student> getStudentsByCellNumber(String cellNumber) {
        return studentRepository.listActiveStudents().stream().filter(x -> x.getCellNumber().equals(cellNumber)).toList();
    }

    //Order students by gpa
    public List<Student> getStudentsOrderedByGpa() {
        return studentRepository.listActiveStudents().stream().sorted((x, y) -> Double.compare(y.getGpa(), x.getGpa())).toList();
    }

    //creates a new Student
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }


}
