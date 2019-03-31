package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest


public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students students;

    @Test
    public void  currentStudentsTest() {
        //Given
        Student expected = new Student(52L,"Brian");
        StudentConfig studentConfig = new StudentConfig();
        //when
        Student actual =studentConfig.currentStudents().findById(52L);
        //then
        Assert.assertEquals(expected.name,actual.name);
    }

    @Autowired
    @Qualifier("preStudents")
    Students prestudents;

    @Test
    public void  previousStudentsTest() {
        //given
        Student expected = new Student(12L, "Ashley");

        //when
        Student actual = prestudents.findById(12L);
        //then
        Assert.assertEquals(expected.name, actual.name);
    }


}
