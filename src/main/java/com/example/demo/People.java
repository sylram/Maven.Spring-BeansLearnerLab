package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> persons){
        this.personList = persons;
    }
//    public People(PersonType...persons){
//        this.personList = new ArrayList<>();
//    }

    public void add (PersonType person){
        personList.add(person);
    }
    public void remove (PersonType person){
        personList.remove(person);
    }
    public int size (){
        return personList.size();
    }
    public void clear (){
        personList.clear();
    }
    public void addAll (Iterable<? extends PersonType> iterable) {
        iterable.forEach(person -> personList.add(person) );

//        Iterator iterator = personList.iterator();
//        while (iterator.hasNext()) {
//            PersonType element = iterator.next();
//            personList.add(element)
//        }
    }

    public PersonType findById (Long id){
        return personList.stream()
                .filter(Person ->Person.getId().equals(id))
                .findFirst().get();
//        PersonType person = null;
//        while(personList.iterator().hasNext()){
//           person = personList.iterator().next();
//           if(person.getId()==id){
//
//           }

    }
    public List<PersonType> findAll(){
        return personList;

    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }


    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
