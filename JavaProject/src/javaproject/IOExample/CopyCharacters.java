/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.IOExample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author johnson
 */
public class CopyCharacters {
    
    public void Do() throws IOException
    {
        FileReader in =null;
        FileWriter out =null;
        
        try
        {
            in = new FileReader("xanadu.txt");
            out = new FileWriter("characteroutput.txt");
            
            int c;
            // one character a time
            while((c=in.read())!=-1)
            {
                
                out.write(c);
            }
            
        }
        finally
        {
            if (in!=null)
            {
                in.close();
            }
            
            if (out !=null)
            {
                out.close();
            }
        }
    }
}
