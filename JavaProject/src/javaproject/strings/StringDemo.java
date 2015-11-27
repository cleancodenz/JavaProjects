/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.strings;

/**
 *
 * @author johnson
 */
public class StringDemo {
    
    public static void Demo()
    {
         String palindrome = "Dot saw I was Tod";
         int len = palindrome.length();
         
         char[] tempCharArray = new char[len];
         char[] charArray = new char[len];
   
         // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = 
                    // to access characters in string using charAt, 0 based
                palindrome.charAt(i);
        } 
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
         String reversePalindrome =
                 //create string with char[]
            new String(charArray);
        System.out.println(reversePalindrome);
    }
    
    // using string builder reverse
    public static void Demo2()
    {
         String palindrome = "Dot saw I was Tod";
         
         StringBuilder sb = new StringBuilder(palindrome);
         
         sb.reverse();
         
         System.out.print(sb);
        
    }
}
