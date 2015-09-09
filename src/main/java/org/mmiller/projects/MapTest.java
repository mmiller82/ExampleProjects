/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g2llc.etl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Maury Miller
 */
public class MapTest {
    
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();
        int duplicate = 0;
        
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>) iterator.next();
            entry.getKey();
            
            if (entry.getValue() > 1) {
                duplicate++;
            }
        }
    }
}
