package com.example.demo;
// The class should consume and set composite reference to an Instructors and Students object upon construction
//The class should define a method hostLecture which makes use of a Teacher teacher,
// double numberOfHours parameter to host a lecture to the composite personList field in the students reference
public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors,Students students){
        this.instructors = instructors;
        this.students = students;
    }
    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students,numberOfHours);

    }
}
