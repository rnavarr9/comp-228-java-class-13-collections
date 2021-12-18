package com.midterm;

import java.util.Hashtable;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // Create a hashtable
        Hashtable<Integer, String> hashColourTable = new Hashtable<Integer, String>();
        // Add mappings to hashtable
        hashColourTable.put(1, "Red");
        hashColourTable.put(2, "Blue");
        hashColourTable.put(3, "Yellow");
        hashColourTable.put(4, "Black");

        System.out.println(hashColourTable);
        String val = hashColourTable.get(3);
        System.out.println(val);

        hashColourTable.remove(3);
        System.out.println(hashColourTable);

        Iterator<Integer> itr = hashColourTable.keySet().iterator();
        while(itr.hasNext()) {
            Integer key = itr.next();
            String mappedValue = hashColourTable.get(key);
            System.out.println("Key " + key + " Value " + mappedValue);
        }
    }
}
