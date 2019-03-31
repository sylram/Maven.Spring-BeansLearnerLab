package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni{


    public Students students;
    public Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("preStudents")Students students, @Qualifier("AllInstructors")Instructors instructors){
        this.students = students;
        this.instructors = instructors;
    }


    public void executeBootcamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

//        instructors.forEach(instructor -> instructor.lecture(students, numberOfHoursPerInstructor));
        for (Student s : students.findAll()) {
            s.learn(numberOfHoursToTeachEachStudent);
        }
        for (Instructor i : instructors) {
            i.setNumberOfHoursTaughtOfHoursTaught(numberOfHoursPerInstructor);
        }


    }
    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }


}
