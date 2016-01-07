/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Collections.ArrayOld;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author johnson
 */
public class CollectionAndArray {
    
    public static void main(String[] args)
    {
        //Collection(list, set, queue and deque) is new way, instead of Array for the old apis
        List<String> list = new ArrayList<String>();
        
        Object[] a = list.toArray();
    }
    
}
