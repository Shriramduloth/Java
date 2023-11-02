package constructor;

class student1 {
    private int age;
    private String name;

    public student1() {
        this("Rahul",20);
        System.out.println("Default constructor is called");
        name = "Rohan";
        age = 10;
    }

    public student1(String name) {
        this();
        this.name = name;
        age = 15;

    }

    public student1(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class launch3 {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.show();

        student1 s2 = new student1("Mohan");
        s2.show();
    }

}
