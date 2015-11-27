/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.lambda;

/**
 *
 * @author johnson
 */
public class CheckPersonEligibleForSelectiveService implements CheckPerson {
        
    public boolean test(Person p)
        {
            return p.gender == Person.Sex.MALE 
                    && p.getAge() >= 18 
                    && p.getAge() <= 25;
        }
}
