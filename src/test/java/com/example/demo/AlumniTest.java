package com.example.demo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AlumniTest {
//    @Autowired @Qualifier("preStudents")
//    Students previousStudents;
//
//    @Autowired @Qualifier("AllInstructors")
//    Instructors instructors;

    @Autowired
    Alumni alumni;

    @Test
    public void executeBootcampTest() {
        //Given

        double expected = 1200;
        Students students = alumni.getStudents();

        //when
        alumni.executeBootcamp();
        //then

        students.forEach(student -> Assert.assertEquals(expected, student.getTotalStudyTime(), 0));

    }

    @Test
    public void executeBootcampTest1() {
        //Given

        double expected = (1200*alumni.students.size())/alumni.instructors.size();
        Instructors instructors = alumni.getInstructors();


        //when
        alumni.executeBootcamp();
        //then

        instructors.forEach(instructor -> Assert.assertEquals(expected, instructor.numberOfHoursTaught(), 0));
    }

}