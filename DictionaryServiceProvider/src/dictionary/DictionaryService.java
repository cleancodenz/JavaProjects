/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import dictionary.spi.Dictionary;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/**
 *
 * @author johnson
 */
public class DictionaryService {

    private static DictionaryService service;
    private ServiceLoader<Dictionary> loader;
    
    
    private DictionaryService(){
        loader = ServiceLoader.load(Dictionary.class);
    }
    
    public static synchronized DictionaryService getInstance() {
        if (service == null) {
            service = new DictionaryService();
        }
        return service;
    }
 
 
    public String getDefinition(String word) {
        String definition = null;
 
        try {
            Iterator<Dictionary> dictionaries = loader.iterator();
            while (definition == null && dictionaries.hasNext()) {
                Dictionary d = dictionaries.next();
                definition = d.getDefinition(word);
            }
        } catch (ServiceConfigurationError serviceError) {
            definition = null;
            serviceError.printStackTrace();
 
        }
        return definition;
    }
    
    
    
}
