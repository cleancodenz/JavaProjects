/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.ExternalLib;

import java.awt.Rectangle;
import rectanglearealib.RectangleArea;

/**
 *
 * @author johnson
 */
public class AreaApp {
    public static void main(String args[])
    {
        int width= 10;
        int height = 5;
        
        Rectangle r = new Rectangle(width,height);
        
        System.out.println("The rectangle's area is "+ RectangleArea.area(r));
    }
    
}
