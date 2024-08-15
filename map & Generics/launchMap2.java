package map;


import java.util.*;
import java.util.Map.*;

class Student
{
    private String name;
    private int age;
    private String city;

   public Student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;

    }
    public String name(){
        return name;
    }
    public int age(){
        return age;
    } 
    public String city(){
        return city;

    }

    public String toString(){
        return(name +" "+age+ " "+city);
    }


}

public class launchMap2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ram", 22, "Mahendragarh");
        Student st2 = new Student("Sahil", 20,"Gurgaon");
        Student st3= new Student("Vinay", 24, "Rewari");

        Map map = new HashMap();
        map.put(1,st1);
        map.put(2, st2);
        map.put(3, st3);


        System.out.println(map);

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry data = (Entry)itr.next();

            System.out.println(data.getKey()+" : "+data.getValue());
        }








        
    }
}
