/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Concurrency;

/**
 *
 * @author johnson
 */
public class HelloThread extends Thread {
    
    public void run() {
        System.out.println("Hello from a thread!");
    }
    
    public static void main(String args[])
    {
        (new HelloThread()).start();
    }
    
}
