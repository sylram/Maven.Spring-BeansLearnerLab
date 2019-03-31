package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


public class Instructors extends People<Instructor> {

    public Instructors(List<Instructor> instructor){
        super(instructor);
    }

}
