/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import dictionary.spi.Dictionary;
import java.util.ServiceLoader;

/**
 *
 * @author johnson
 */
public class DictionaryService {

    private static DictionaryService service;
    private ServiceLoader<Dictionary> loader;
    
    
    private DictionaryService(){
        if(service == null)
        {
            service = new DictionaryService();
        }
    }
    
}
