/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author johnson
 */
public class CountDown {
    
    public static void main(String[] args) throws InterruptedException
    {
      
       // LinkedListExample(args);
        PriorityQueueExample(args);
        
       
    }
    
    static <E> List<E> heapSort(Collection<E> c) 
    {
        /**
         * PriorityQueue is another implementation of Queue
         * Items added to the queue are sorted into a priority heap, the head is the smallest 
         **/
        Queue<E> queue = new PriorityQueue<E>(c);
        List<E> result = new ArrayList<E>();
        
        while(!queue.isEmpty())
        {
            result.add(queue.remove());
        }
        
        return result;
    }
    
    static void LinkedListExample(String[] args) throws InterruptedException 
    {
          int time = Integer.parseInt(args[0]);
         /**
         * LinkedList is an implementation of Queue (FIFO)
         **/
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = time; i>0; i--)
        {
            queue.add(i);
        }
        
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());
            
            Thread.sleep(1000);
        }
    }
    
    static void PriorityQueueExample(String[] args) throws InterruptedException 
    {
          int time = Integer.parseInt(args[0]);
         /**
         * LinkedList is an implementation of Queue (FIFO)
         **/
        Queue<Integer> queue = new PriorityQueue<Integer>();
        
        for(int i = time; i>0; i--)
        {
            queue.add(i);
        }
        
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());
            
            Thread.sleep(1000);
        }
    }
}
