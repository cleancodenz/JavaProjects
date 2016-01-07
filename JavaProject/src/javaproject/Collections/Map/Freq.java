/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *A Map is an object that maps keys to values. 
 * A map cannot contain duplicate keys: 
 * Each key can map to at most one value. 
 * It models the mathematical function abstraction
 * 
 * The Java platform contains three general-purpose Map implementations: 
 *  HashMap, TreeMap, and LinkedHashMap. 
 * Their behavior and performance are precisely analogous to HashSet, TreeSet, and LinkedHashSet
 * 
 * It is very similar to Set
 * @author johnson
 */
public class Freq {
    
    // args :if it is to be it is up to me to delegate
    public static void main(String[] args)
    {
        /**
         * Output is {to=3, is=2, it=2, if=1, me=1, delegate=1, up=1, be=1}, not sorted
         **/
       // Map<String, Integer> m = new HashMap<String, Integer>();
        
        /**
         *Output is {be=1, delegate=1, if=1, is=2, it=2, me=1, to=3, up=1}, sorted by key
         **/
       // Map<String, Integer> m = new TreeMap<String, Integer>();
        
        /**
         * Output is {if=1, it=2, is=2, to=3, be=1, up=1, me=1, delegate=1}, order is same as input
         **/
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        
        
        
        for (String a:args)
        {
                Integer freq= m.get(a);
                m.put(a, (freq==null)?1:freq+1);
        }
        
        System.out.println(m.size() + " distinct words");
        System.out.println(m);
        
    }
    
}
