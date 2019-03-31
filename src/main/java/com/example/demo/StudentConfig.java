package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean(name = "students")
    public Students currentStudents(){

        List<Student> current = new ArrayList<>();
        current.add(new Student(34L,"Francisco"));
        current.add(new Student(52L,"Brian"));
        current.add(new Student(90L,"Jim"));

        return new Students(current);
    }

    @Bean(name = "preStudents")
    public Students previousStudents(){
        List<Student> previous = new ArrayList<>();
        previous.add(new Student(12L,"Ashley"));
        previous.add(new Student(20L,"Brandon"));
        previous.add(new Student(70L,"Jessica"));
        Students students = new Students(previous);
        return students;
    }
}
