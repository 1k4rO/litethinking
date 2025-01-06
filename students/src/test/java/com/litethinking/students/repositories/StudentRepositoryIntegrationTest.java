package com.litethinking.students.repositories;

import com.litethinking.students.TestDataUtil;
import com.litethinking.students.domain.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class StudentRepositoryIntegrationTest {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentRepositoryIntegrationTest(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Test
    public void testThatStudentCanBeSaved() {
        Student student = TestDataUtil.createStudentA();
        studentRepository.addStudent(student);

        Optional<Student> savedStudent = studentRepository.getStudent(student.getId());
        assertThat(savedStudent).isPresent();
        assertThat(savedStudent.get()).isEqualTo(student);
    }


    @Test
    public void testThatMultipleStudentsCanBeSaved() {
        Student studentA = TestDataUtil.createStudentA();
        Student studentB = TestDataUtil.createStudentB();
        Student studentC = TestDataUtil.createStudentC();
        Student studentD = TestDataUtil.createStudentD();
        Student studentE = TestDataUtil.createStudentE();
        Student studentF = TestDataUtil.createStudentF();
        Student studentG = TestDataUtil.createStudentG();
        Student studentH = TestDataUtil.createStudentH();
        Student studentI = TestDataUtil.createStudentI();
        Student studentJ = TestDataUtil.createStudentJ();
        Student studentK = TestDataUtil.createStudentK();

        studentRepository.addStudent(studentA);
        studentRepository.addStudent(studentB);
        studentRepository.addStudent(studentC);
        studentRepository.addStudent(studentD);
        studentRepository.addStudent(studentE);
        studentRepository.addStudent(studentF);
        studentRepository.addStudent(studentG);
        studentRepository.addStudent(studentH);
        studentRepository.addStudent(studentI);
        studentRepository.addStudent(studentJ);
        studentRepository.addStudent(studentK);

        System.out.println("Listado estudiantes activos: "+ studentRepository.toString());
        assertThat(studentRepository.listActiveStudents()).hasSize(11);
        assertThat(studentRepository.listActiveStudents()).containsExactly(studentA, studentB, studentC, studentD, studentE, studentF, studentG, studentH, studentI, studentJ, studentK);
    }
}
