package map;

import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {

        // // typesafety
        // String ar[] = new String[10];
        // ar[0] = "Ram";
        // ar[1] = "Yadav";
        // //ar[2]= 10;

        // String name1 = ar[0];
        // String name2 = ar[1];

        // // no typesafety
        ArrayList<String> al = new ArrayList<String>();

        al.add("Ram");
        al.add("Yadav");

        // al.add(10);

        // String n1 = (String)al.get(0); //typecasting
        String n1 = al.get(0);
        String n2 = al.get(1);

        // String n3 = (String)al.get(2);

    }

}
