/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *When no comparator, it will use natural ordering
 * @author johnson
 */
public class EmpSort {
    static final Comparator<Name> SENIORITY_ORDER = new Comparator<Name>(){
        
        public int compare(Name n1, Name n2)
        {
            int lastCmp = n1.lastName().compareTo(n2.lastName());
        
            return (lastCmp !=0? lastCmp: n1.firstName().compareTo(n2.firstName())); 
        }

    };
    
    public static void main(String[] args) {
        Name[] nameArray = {
            new Name("John", "Smith"),
            new Name("Karl", "Ng"),
            new Name("Jeff", "Smith"),
            new Name("Tom", "Rich")
        
        };
        
        List<Name> names = Arrays.asList(nameArray);
        
        Collections.sort(names, SENIORITY_ORDER);
        
        System.out.println(names);
    }
    
    
}
