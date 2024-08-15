package map;

import java.util.Hashtable;
import java.util.TreeMap;

public class launchMap3 {
    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();
        ht.put(1, "ram");
        ht.put(2 , "Mohan");
        ht.put(3, "Sohan");

        
        ht.putIfAbsent(4, "Mohit");
        
        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(3, "ram");
        tm.put(2 , "Mohan");
        tm.put(1, "Sohan");
        tm.put(4, "mohit");

        System.out.println(tm);




    }
}
