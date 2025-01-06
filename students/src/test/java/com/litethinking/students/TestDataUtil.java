package com.litethinking.students;

import com.litethinking.students.domain.Student;

public final class TestDataUtil {


    public static Student createStudentA() {
        return Student.builder()
                .id(1L)
                .name("Jason Foe")
                .cellNumber("3111234567")
                .email("jason@gmail.es")
                .studentNumber(452575L)
                .gpa(4.75F)
                .build();
    }


    public static Student createStudentB() {
        return Student.builder()
                .id(2L)
                .name("Jade")
                .cellNumber("3100123456")
                .email("jade@outlook.es")
                .studentNumber(452576L)
                .gpa(4.00F)
                .build();
    }


    public static Student createStudentC() {
        return Student.builder()
                .id(3L)
                .name("Felix Lopez")
                .cellNumber("3524567891")
                .email("felix@gmail.es")
                .studentNumber(452577L)
                .gpa(3.8F)
                .build();
    }


    public static Student createStudentD() {
        return Student.builder()
                .id(4L)
                .name("Fernando Camargo")
                .cellNumber("3057811245")
                .email("fernando@gmail.es")
                .studentNumber(452578L)
                .gpa(4.00F)
                .build();
    }


    public static Student createStudentE() {
        return Student.builder()
                .id(5L)
                .name("Antonio Thinking")
                .cellNumber("315023657")
                .email("antornio@gmail.es")
                .studentNumber(452579L)
                .gpa(4.6F)
                .build();
    }


    public static Student createStudentF() {
        return Student.builder()
                .id(6L)
                .name("Kike Tabo")
                .cellNumber("3586567841")
                .email("kike@outlook.es")
                .studentNumber(452580L)
                .gpa(5.00F)
                .build();
    }



    public static Student createStudentG() {
        return Student.builder()
                .id(7L)
                .name("Erick Almanza")
                .cellNumber("3598746235")
                .email("erick@outlook.es")
                .studentNumber(452590L)
                .gpa(4.65F)
                .build();
    }



    public static Student createStudentH() {
        return Student.builder()
                .id(8L)
                .name("Frank Enstein")
                .cellNumber("3965487632")
                .email("frank@outlook.es")
                .studentNumber(452591L)
                .gpa(4.8F)
                .build();
    }



    public static Student createStudentI() {
        return Student.builder()
                .id(9L)
                .name("Adrian Capera")
                .cellNumber("3056987526")
                .email("adrian@gmail.es")
                .studentNumber(452592L)
                .gpa(3.2F)
                .build();
    }



    public static Student createStudentJ() {
        return Student.builder()
                .id(10L)
                .name("Will Iam")
                .cellNumber("3258459762")
                .email("will@gmail.es")
                .studentNumber(452593L)
                .gpa(2.75F)
                .build();
    }



    public static Student createStudentK() {
        return Student.builder()
                .id(11L)
                .name("Norbert Camus")
                .cellNumber("3256971235")
                .email("norbert@gmail.es")
                .studentNumber(452594L)
                .gpa(4.95F)
                .build();
    }




}
