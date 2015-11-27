/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.generics;

/**
 *
 * @author johnson
 */
public class GenericsDemo {
    
    public static void Demo()
    {
        // cannot use Box<int> as in java you can not use primitive type(int, char) in Generics
        // must use class types (Integer, Character)
         Box<Integer> integerBox = new Box();
        // following gives a warning
        // Box<Integer> integerBox1 = new Box<Integer>();
        integerBox.set(10);
        //integerBox.inspect("some text"); // error: this is still String!
    }
    
}
