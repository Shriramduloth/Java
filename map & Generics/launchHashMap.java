package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * launchHashMap
 */
public class launchHashMap {

    public static void main(String[] args) {

        HashMap hm1 = new HashMap();
        // hm1.put(null, null);
        hm1.put(01, "Virat");
        hm1.put(02, "Rohit");
        hm1.put(03, "Rohan");
        System.out.println(hm1);

        HashMap hm2 = new HashMap();

        hm2.put("Virat", "Virat");
        hm2.put("Rohan", "Rohit");
        hm2.put("Rohit", "Rohan");
        // hm2.put(03, "Rohit");
        System.out.println(hm2);

        //for same entered data use linkedhashmap

        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put("Virat", "Virat");
        lhm.put("Rohan", "Rohit");
        lhm.put("Rohit", "Rohan");
        System.out.println(lhm);

    }
}