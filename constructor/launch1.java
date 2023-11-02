package constructor;

class Student {
    private int age;
    private String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public void setName(String name) {
    // this.name = name;
    // }
    // public void setAge(int age) {
    // this.age = age;
    // }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class launch1 {
    public static void main(String[] args) {
        Student obj1 = new Student("Ram", 20);
        int age = obj1.getAge();
        String name = obj1.getName();
        System.out.println(age);
        System.out.println(name);

    }

}