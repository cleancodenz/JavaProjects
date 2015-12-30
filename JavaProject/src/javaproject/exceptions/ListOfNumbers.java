/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnson
 */
public class ListOfNumbers {
    
    private List<Integer> list;
    private static final int SIZE = 10;
    
    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }
    
    public void writeList()
    {
        // The filterwriter constructor throws IOException, which must be caught
        // as IOExpception is checked exception
       // PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        
        // right way
        
        PrintWriter out = null;
        
        try
        {
            System.out.println("Entered try statment");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            
             for(int i =0; i< SIZE ; i++)
            {
                //potentially get(i) might throw indexoutofbound exception, 
                //but it is unchecked, it does not force handling as the checked exceptions do, but can be caught
            
                out.println("Value at:" + i +" = "+ list.get(i));
            }
        }
        catch( IndexOutOfBoundsException e)
        {
             System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.err.println("Caught IOException: " +e.getMessage());
        }
        finally
        {
            if (out!=null)
            {
                System.out.println("Closing PrintWriter");
                out.close(); 
            }
            else
            {
                 System.out.println("PrintWriter not open");
            }
        }
           
 
    }
    
    // some time it is better to let a method further up the call stack handle the exception
    public void writeList2() throws IOException, IndexOutOfBoundsException
    {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }
    
    // logging api, even though in writeList2 we throw IndexOutOfBoundsException
    // which is a unchecked execption(RuntimeException (this case) and Error) it does not need to be handled explicitly
    // While checked exception must be as IOException in this case
    //Unchecked Exceptions — The Controversy- recover from exception, make it checked exception, cannot do anything to recover from the exception make it unchecked
    public void writeList3() 
    {
        try
        {
            writeList2();
        }
        catch(IOException e)
        {
                Logger logger = Logger.getLogger("package.name"); 
               StackTraceElement elements[] = e.getStackTrace();
                for (int i = 0, n = elements.length; i < n; i++) {
                    logger.log(Level.WARNING, elements[i].getMethodName());
                }
            
        }
    }
    
    // Try -with-resources where resources implements java.lang.AutoCloseable
    // in this example BufferReader is a resource
    // this is also example of throwing same checked exception without handling-further up, not the try-catch, the try means try-with-resources
    static String readFirstLineFromFile(String path) throws IOException 
    {
        try (BufferedReader br =
                   new BufferedReader(new FileReader(path))) 
        {
            return br.readLine();
        }
    }
    
    // Example try- with -resources multiple resources
    //In this example, the try-with-resources statement contains two declarations that are separated by a semicolon: ZipFile and BufferedWriter. When the block of code that directly follows it terminates, either normally or because of an exception, the close methods of the BufferedWriter and ZipFile objects are automatically called in this order. Note that the close methods of resources are called in the opposite order of their creation.
    
    public static void writeToFileZipFileContents(String zipFileName,
                                           String outputFileName)
                                           throws IOException 
    {
        java.nio.charset.Charset charset =
         java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath =
         java.nio.file.Paths.get(outputFileName);
    
        try(
                java.util.zip.ZipFile zf =
                        new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer =
                        java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
                )
        {
            
            // Enumerate each entry
            for (java.util.Enumeration entries =
                                zf.entries(); entries.hasMoreElements();) 
            {
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
            
                String zipEntryName =
                 ((java.util.zip.ZipEntry)entries.nextElement()).getName() +
                 newLine;
            
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
        
    }
}
