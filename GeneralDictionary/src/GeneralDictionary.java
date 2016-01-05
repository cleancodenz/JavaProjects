/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dictionary.spi.Dictionary;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author johnson
 */
public class GeneralDictionary implements Dictionary {

    private SortedMap<String, String> map;
    
    public GeneralDictionary()
    {
        map = new TreeMap<String, String>();
        map.put("book",
                "a set of written or printed pages, usually bound with \" +\n" +
"                \"a protective cover");
        map.put("editor",
                "a person who edits");
    }
    
    @Override
    public String getDefinition(String word) {
        return map.get(word);
    }

    
    
}
