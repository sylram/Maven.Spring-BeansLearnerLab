package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {




    @Bean(name = "currentCohort")
    @DependsOn({"AllInstructors", "students"})

    public Classroom currentCohort(@Qualifier("AllInstructors")Instructors instructors,
                                   @Qualifier("students")Students students) {
        return new Classroom(instructors,students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"AllInstructors", "preStudents"})
    public Classroom previousCohort(@Qualifier("AllInstructors") Instructors instructors,
                                   @Qualifier("preStudents")Students students){
        return new Classroom(instructors,students);
    }
}
