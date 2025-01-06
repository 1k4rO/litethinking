package com.litethinking.students.repositories;


import com.litethinking.students.domain.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentRepository {

    private final ArrayList<Student> activeStudents;

    public StudentRepository (ArrayList<Student> activeStudents){
        this.activeStudents = activeStudents;
    }

    public void addStudent(Student student){
        activeStudents.add(student);
    }

    public void removeStudent(Student student){
        activeStudents.remove(student);
    }

    public void updateStudent(Student student){
        for (int i = 0; i < activeStudents.size(); i++) {
            if (activeStudents.get(i).getId().equals(student.getId())){
                activeStudents.set(i, student);
            }
        }
    }

    public ArrayList<Student> listActiveStudents(){
        return activeStudents;
    }

    public Optional<Student> getStudent(Long id){
        List<Student> results = activeStudents.stream().filter(student -> student.getId().equals(id)).toList();
        return results.stream().findFirst();
    }

    @Override
    public String toString() {

        if (activeStudents.isEmpty()){
            return "No active students";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < activeStudents.size(); i++) {
            result.append(activeStudents.get(i));
            result.append("\n");
        }

        return "StudentRepository{" +
                "activeStudents=" + result +
                '}';
    }

}
