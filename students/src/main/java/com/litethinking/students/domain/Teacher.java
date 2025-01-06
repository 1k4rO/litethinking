package com.litethinking.students.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Teacher extends Person {

    private Long teacherNumber;

    private Double salary;

    public ArrayList<String> assignedSubjects(){
        //TO-DO Implement subject entity, for now all the teachers will have the same assigned subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Macro-economy");
        return subjects;
    }

}
