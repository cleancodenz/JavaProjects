/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.IOExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author johnson
 */
public class CopyLines {
    
    public void Do() throws IOException
    {
        // these are buffered character stream, for bytes using  BufferedInputStream, BufferedOutputStream
        BufferedReader in =null;
        PrintWriter out =null;
        
        try
        {
            in = new BufferedReader(new FileReader("xanadu.txt"));
            out = new PrintWriter(new FileWriter("linesoutput.txt"));
            
            String l;
            // one character a time
            while((l=in.readLine())!=null)
            {
                
                out.println(l);
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
