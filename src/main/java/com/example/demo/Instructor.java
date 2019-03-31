package com.example.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;



public class Instructor extends Person implements Teacher{

    double numberOfHoursTaught;


    public Instructor(Long id, String name) {
        super(id, name);
    }

    public double numberOfHoursTaught(){
        return numberOfHoursTaught;
    }

    public void setNumberOfHoursTaughtOfHoursTaught(double hours){
       this.numberOfHoursTaught += hours;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
    learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
//           int size1= ((Collection<?>) learners).size();
        int size = 0;
        for (Learner l :learners){
            size++;
        }
        double numberOfHoursPerLearner = numberOfHours / size;
        learners.forEach(learner ->learner.learn(numberOfHoursPerLearner));







//        Iterator iterator = learners.iterator();
//
//       while (iterator.hasNext()){size++;}
//
//
//        for(Learner learner: learners){
//            learner.learn(numberOfHoursPerLearner);
//        }

    }
}
