/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements
 * 
 *Two general-purpose List implementations. 
 *  ArrayList, which is usually the better-performing implementation, 
 *  and LinkedList which offers better performance under certain circumstances.
 * 
 * @author johnson
 * 
 */
public class Shuffle {
    
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        for (String a : args)
        {
            list.add(a);
        }
        
        // or
         // List<String> list = Arrays.asList(args);
        
        shuffle(list, new Random());
        System.out.println(list);
        
    }
    
    public static void shuffle(List<?> list, Random rnd)
    {
        for (int i = list.size(); i> 1; i--)
        {
            swap(list, i-1, rnd.nextInt(i));
        }
    }
    
    // funny way of using generics
    public static <E> void swap(List<E> a , int i, int j)
    {
        // way of get 
        E temp = a.get(i);
        // way of set
        a.set(i,a.get(j));
        a.set(j, temp);
        
    }
    
}
