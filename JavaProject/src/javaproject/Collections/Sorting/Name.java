/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Sorting;

/**
 *
 * @author johnson
 */
public class Name implements Comparable<Name> {

    private final String firstName, lastName;
    
    public Name(String firstName, String lastName)
    {
        if (firstName==null || lastName==null)
        {
            throw new NullPointerException();
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String firstName() { return firstName;}
    public String lastName() {return lastName;}
    
    public boolean equals(Object o)
    {
        if(! (o instanceof Name))
        {
            return false;
        }
        
        Name n = (Name) o;
        
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }
    
    public int hashCode()
    {
        return 31*firstName.hashCode() + lastName.hashCode();
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    @Override
    public int compareTo(Name t) {
        int lastCmp = lastName.compareTo(t.lastName);
        
        return (lastCmp !=0? lastCmp: firstName.compareTo(t.firstName));
    }
    
}
