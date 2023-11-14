package inheritance;

class Human1 {
    int age;

    Human1() {
        System.out.println("Human class constructor");
    }

    void sleep() {
        age=20;
System.out.println("Human needs good sleep");
System.out.println("age is "+age);
    }
}

class Student1 extends Human1{

    void show(){
        //System.out.println("the name is "+name);
        System.out.println("the age is "+age);
    }
}

public class launch1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.sleep();
        s.show();

    }
}
