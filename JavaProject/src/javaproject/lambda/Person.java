/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.lambda;

import java.util.Date;
import java.util.List;

/**
 *
 * @author johnson
 */
public class Person {

    
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Date birthday;
    Sex gender;
    String emailAddress;
    int age;
  
    public int getAge() {
        return age;
    }
    
    public void printPerson()
    {
        
    }

    public static void printPersonOlderThanProach1(List<Person> roster, int age)
    {
        for (Person p: roster)
        {
            if(p.getAge() >= age)
            {
                p.printPerson();
            }
        }
    }
    
    public static void printPersonOlderThanProach2(List<Person> roster, int low, int high)
    {
        for (Person p: roster)
        {
            if(low<=p.getAge() && p.getAge()< high)
            {
                p.printPerson();
            }
        }
    }
    
    
        
    public static void printPersonOlderThanProach3(List<Person> roster, CheckPerson tester)
    {
        for (Person p: roster)
        {
            if(tester.test(p))
            {
                p.printPerson();
            }
        }
    }
    
    public static void printPersonProach3(List<Person> roster)
    {
        printPersonOlderThanProach3(roster,new CheckPersonEligibleForSelectiveService());
    }
    
    // anonymous class
    public static void printPersonOlderThanProach4(List<Person> roster)
    {
        printPersonOlderThanProach3(roster,
                new CheckPerson(){
                    public boolean test(Person p) {
                        return p.gender == Person.Sex.MALE &&
                                p.getAge() >= 18 &&
                                p.getAge() <= 25;
                        }   
                });
    }
    
   // Lambda for java 8 only
    /**
    public static void printPersonOlderThanProach5(List<Person> roster)
    {
        
        printPersonOlderThanProach3(roster,
                (Person p)-> p.getGender() == Person.Sex.MALE
        && p.getAge() >= 18
        && p.getAge() <= 25);
    }
   **/
    
}

