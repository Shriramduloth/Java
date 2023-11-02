package encapsulation;


class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class launch1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.setAge(18);
        obj1.setName("ram");
        obj2.setAge(20);
        obj2.setName("sahil");
        int stud1Age = obj1.getAge();
        System.out.println(stud1Age);
    }

}