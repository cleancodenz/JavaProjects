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
public class HelloRunable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }
    
    public static void main(String args[]) {
        // the array args definition is different from String[] args, the same though
        // when Run is disabled even when main is defined, restart the NetBeans
        // To run app with a different main, select properties of project and change main class
        (new Thread(new HelloRunable())).start();
    }
    
}
