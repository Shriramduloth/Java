package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class launchMap {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(1, "Rohan");
        m.put(2, "Rohit");
        m.put(3, "Rahul");
        m.put(4, "Ramesh");

        System.out.println(m);

        System.out.println(m.get(4));

        Set KeySet = m.keySet();
        Iterator itr = KeySet.iterator();

        while (itr.hasNext()) {
            // System.out.println(itr.next());
            Integer key = (Integer)itr.next();
            System.out.println(key);
        }

        Collection values = m.values();
        Iterator itr1 = values.iterator();

        while (itr1.hasNext()) {
            // System.out.println(itr1.next());
            String name = (String)itr1.next();
            System.out.println(name);
        }

        Set entry= m.entrySet();
        Iterator itr2 =entry.iterator();
        while(itr2.hasNext()){
            // System.out.println(itr2.next());
            Map.Entry data= (Entry)itr2.next();
            System.out.println(data.getKey()+ " : "+data.getValue());
        }
    }
}
