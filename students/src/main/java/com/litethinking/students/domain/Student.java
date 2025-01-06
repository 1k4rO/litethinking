package com.litethinking.students.domain;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Student extends Person {

    private Long studentNumber;

    private Float gpa;

    public ArrayList<String> listSubjects(){
        //TO-DO implement subjects entity!
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("English");
        subjects.add("Science");
        subjects.add("History");
        return subjects;
    }

    public ArrayList<String> seminarsTaken(){
        //TO-DO implement seminars entity
        ArrayList<String> seminars = new ArrayList<>();
        seminars.add("Programming 101");
        seminars.add("Introduction to physics");
        seminars.add("Fluid Mechanics");
        seminars.add("MacroEconomy");
        return seminars;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", cellNumber='" + getCellNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                "studentNumber=" + studentNumber +
                ", gpa=" + gpa +
                '}';
    }

}
