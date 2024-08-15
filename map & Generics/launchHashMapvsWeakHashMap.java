package map;

import java.util.HashMap;

import java.util.*;

class Employee {
    private int emp_id;
    private String name;

    public Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;

    }

    public String toString() {
        return emp_id + " " + name;
    }

    @Override
    public void finalize() {
        System.out.println("Cleanup work by garbage collector");
    }
}

public class launchHashMapvsWeakHashMap {

    public static void main(String[] args) {

        Employee e = new Employee(1, "Ram");
        // HashMap hm = new HashMap();
        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "ram");
        System.out.println(hm);

        e = null;
        System.gc();
        System.out.println(hm);
        System.out.println("last line");

    }
}   