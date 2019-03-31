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


public class InstructorConfigTest {

    @Autowired
    @Qualifier("UKInstructors")
    Instructors UKInstructors;

    @Test
    public void tcUkInstructorsTest() {
        //Given
        String expected = "Patrick";

        //when
       Instructor actual = UKInstructors.findById(210L);

        //then
        Assert.assertEquals(expected,actual.getName());
    }

    @Autowired
    @Qualifier("UsaInstructors")
    Instructors USInstructors;

    @Test
    public void tcUsaInstructorsTest() {
        //Given
        String expected = "Leon";

        //when
        Instructor actual =USInstructors.findById(100L);

        //then
        Assert.assertEquals(expected,actual.name);
    }
    @Autowired
    @Qualifier("AllInstructors")
    Instructors AllInstructors;

    @Test
    public void allInstructorsTest() {
        //Given
        String expected = "Nhu";

        //when
        String actual =AllInstructors.findById(102L).getName();

        //then
        Assert.assertEquals(expected,actual);
    }

}
