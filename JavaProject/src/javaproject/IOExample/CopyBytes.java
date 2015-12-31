/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.IOExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author johnson
 */
public class CopyBytes 
{

    public void Do() throws IOException
    {
        FileInputStream in =null;
        FileOutputStream out =null;
        
        try
        {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            
            int c;
            // one byte a time
            while((c=in.read())!=-1)
            {
                System.out.format("%c",(char)c);
                
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
