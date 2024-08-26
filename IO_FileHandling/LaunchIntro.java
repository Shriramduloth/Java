package IO_FileHandling;


public class LaunchIntro {
    public static void main(String[] args) {
        Student st1 = new Student("Ram", 22, "MHRG");
        System.out.println(st1);
        Student st2 = new Student("Sahil", 21, "Rewari");
        System.out.println(st2);
    }
}

class Student{

    private String name;
    private int age ;
    private String city;

    public Student(String name ,int age , String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString(){
        return "Name:"+name+" | age:"+age+" | city:"+city;
    }
}