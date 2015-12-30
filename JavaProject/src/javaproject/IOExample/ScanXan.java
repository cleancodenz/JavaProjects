/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.IOExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author johnson
 * Scanner api useful to break down formatted input into tokens 
 */
public class ScanXan {
    
    public void Do() throws IOException
    {
        Scanner s =null;
        
        try
        {
           s = new Scanner(new BufferedReader(new FileReader("xanadu.txt"))) ;
           while(s.hasNext())
           {
               System.out.println(s.next());
               
               /** this breaks the line into words, using a different token separator, invoke useDelimiter(),s.useDelimiter(",\\s*");
                
                In
Xanadu
did
Kubla
Khan
A
stately
pleasure-dome
                
                **/
               
           }
        }
        finally
        {
            if (s!=null)
            {
                s.close();
            }

        }
    }
}
