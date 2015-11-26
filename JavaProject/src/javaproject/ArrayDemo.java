/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author johnson
 */
public class ArrayDemo {
    
    //declare an array of integers
    int[] anArray;
    
    public ArrayDemo()
    {
        //allocates memory for 10 integers
        anArray = new int[10];
        
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        // alternatively
        int[] myArray = {
               100, 200, 300,
               400, 500, 600, 
               700, 800, 900, 1000
        };
        
        String[][] names = {
            { "Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        
    }
    
    void printStates()
    {
        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
    
    void howToCopyArra()
    {
         char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
         /**
         char[] copyTo = new char[7];
         
         System.arraycopy(copyFrom, 2, copyTo, 0, 7);
         **/
         
         char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
         
         System.out.println(new String(copyTo));
         
    }
}
