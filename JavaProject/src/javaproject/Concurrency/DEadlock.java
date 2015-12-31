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
 * Deadlock describes a situation where two or more threads are blocked forever, waiting for each other
 * 
 */
public class DEadlock {
    
    static class Friend {
        
        private final String name;
        
        public Friend(String name) {
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
        
        //When a thread invokes a synchronized method, it automatically acquires the intrinsic lock for that method's object and releases it when the method returns. 
        // you can aldo do that in none synchronized method by calling 
        //synchronized(this) {
     //   lastName = name;
      //  nameCount++;
    //}
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                + "  has bowed to me!%n", 
                this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
        }
    }
    
    //When Deadlock runs, 
    //it's extremely likely that both threads will block when they attempt to invoke bowBack.
    //Neither block will ever end, because each thread is waiting for the other to exit bow.
    
    public static void main(String[] args) {
        final Friend alphonse =
            new Friend("Alphonse");
        
        final Friend gaston =
            new Friend("Gaston");
        
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
    }
    
}
