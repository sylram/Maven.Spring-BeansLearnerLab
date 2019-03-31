package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ClassrroomConfigTest {

    @Autowired @Qualifier("previousCohort")
    Classroom preClassroom;
    @Autowired @Qualifier("currentCohort")
    Classroom classroom;
    @Before




    @Test
        public void currentCohortTest() {
            //Given
            String expected = "Brian";
            //when
            Student actual =classroom.getStudents().findById(52L);
            //then
            Assert.assertEquals(expected,actual.name);
        }

    @Test
    public void previousCohortTest() {
        //Given
        String expected = "Brandon";

        //when
        Student actual =preClassroom.getStudents().findById(20L);
        //then
        Assert.assertEquals(expected,actual.name);
    }

    @Test
    public void previousCohortTest2() {
        //Given
        String expected = "Leon";

        //when
        String actual =preClassroom.getInstructors().findById(100L).getName();
        System.out.println(preClassroom.getInstructors().size());
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void currentCohortTest2() {
        //Given
        String expected = "Florence";

        //when
        String actual =preClassroom.getInstructors().findById(203L).getName();
        //then
        Assert.assertEquals(expected,actual);
    }

//    @After
//    @Test
//    public void setInstructorsTest() {
//        //Given
//        String expected = "Danielle";
//        Instructor instructor = new Instructor(215L,expected);
//        List<Instructor> instructorList = new ArrayList<>();
//        instructorList.add(instructor);
//        Instructors instructors = new Instructors(instructorList);
//
//        //when
//        preClassroom.setInstructors(instructors);
//        String actual =preClassroom.getInstructors().findById(215L).getName();
//        //then
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void setStudentsTest() {
//        //Given
//        String expected = "Marlys";
//        Student student = new Student(7L,expected);
//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(student);
//        Students students = new Students(studentsList);
//
//        //when
//        preClassroom.setStudents(students);
//        String actual =preClassroom.getStudents().findById(7L).getName();
//        //then
//        Assert.assertEquals(expected,actual);
//    }
}
