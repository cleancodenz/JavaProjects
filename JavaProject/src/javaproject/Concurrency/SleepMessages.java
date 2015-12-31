/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Concurrency;

/**
 *
 * @author johnson
 * 
 * Thread.Sleep , 
 * This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system
 * The sleep method can also be used for pacing
 * To terminate a thread, using interrupt
 */
public class SleepMessages {
    
    public static void main(String args[])
        throws InterruptedException { //this exception is one sleep method throws

        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        
        for(int i =0; i < importantInfo.length; i++)
        {
            // Pause for 4 seconds
            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e) {
                // We have been interrupted, no more messages
                return;
            }
            System.out.println(importantInfo[i]);
        }
    }
    
}
