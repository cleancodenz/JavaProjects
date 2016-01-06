/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * A Set is a Collection that cannot contain duplicate elements
 * Set is an interface, it has three general-purpose Set implementations: HashSet, TreeSet, and LinkedHashSet.
 * @author johnson
 */
public class FindDups {
    
    //arguments: i came i saw i left
    public static void main(String[] args)
    {
       /**
        * Note that the code always refers to the Collection by its interface type (Set) rather than by its implementation type.
        * This is a strongly recommended programming practice because it gives you the flexibility to change implementations merely by changing the constructor
        * 
        **/ 
        
       /**
        * HashSet :
        * which stores its elements in a hash table, is the best-performing implementation; 
        * however it makes no guarantees concerning the order of iteration
        * Output :left, saw, came, i
        */ 
       Set<String> distinctWords =  new HashSet<String>();
       
        /**
         * TreeSet:
         * 
         * Which stores its elements in a red-black tree, orders its elements based on their values; 
         * it is substantially slower than HashSet
         * 
         * Output: came, i, left, saw
         **/
       //Set<String> distinctWords = new TreeSet<String>();
        
        /**
         * LinkedHashSet
         * 
         * which is implemented as a hash table with a linked list running through it, 
         * orders its elements based on the order in which they were inserted into the set (insertion-order)
         * 
         * Output is: i, came, saw, left
         **/
       
      //  Set<String> distinctWords = new LinkedHashSet<String>();
       
       for (String a : args)
       {
           distinctWords.add(a);
           
       }
 
       System.out.println(distinctWords.size()+" distinct words: "+distinctWords);
 
    }
    
}
