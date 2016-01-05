/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author johnson
 */
public class DictionaryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DictionaryService dictionary = DictionaryService.getInstance();
        System.out.println(DictionaryDemo.lookup(dictionary, "book"));
        System.out.println(DictionaryDemo.lookup(dictionary, "editor"));
        System.out.println(DictionaryDemo.lookup(dictionary, "xml"));
        System.out.println(DictionaryDemo.lookup(dictionary, "REST"));
        
    }
    
     public static String lookup(DictionaryService dictionary, String word) {
    String outputString = word + ": ";
    String definition = dictionary.getDefinition(word);
    if (definition == null) {
      return outputString + "Cannot find definition for this word.";
    } else {
      return outputString + definition;
    }
  }
    
}
