package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//The class should define a bean named instructors which returns all
// Instructors employed at ZipCodeWilmington
//annotate this bean with @Primary
//this ensures Spring will inject this bean in the case that an Autowire
// annotation is not supplied with a Qualifier annotation
@Configuration
public class InstructorsConfig {

    @Bean(name = "UsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> current = new ArrayList<>();
        current.add(new Instructor(100L,"Leon"));
        current.add(new Instructor(102L,"Nhu"));
        current.add(new Instructor(108L,"Whil"));

        return new Instructors(current);
    }


    @Bean(name = "UKInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> current = new ArrayList<>();
        current.add(new Instructor(200L,"Kate"));
        current.add(new Instructor(203L,"Florence"));
        current.add(new Instructor(210L,"Patrick"));
        return new Instructors(current);
    }

    @Primary
    @Bean(name ="AllInstructors")
    public Instructors allInstructors(){
//        List<Instructor> current = new ArrayList<>();
//        current.add(tcUkInstructors().iterator().next());
//        current.add(tcUsaInstructors().iterator().next());
//        return new Instructors(current);

        List <Instructor> answer = Stream.concat(tcUkInstructors().findAll().stream(),
                tcUsaInstructors().findAll().stream())
                .collect(Collectors.toCollection(ArrayList::new));
        return new Instructors(answer);
    }

}

