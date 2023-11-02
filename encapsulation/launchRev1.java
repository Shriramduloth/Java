package encapsulation;

class Student1 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {

            this.age = age;
        } else {
            System.out.println("age must be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class launchRev1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("Ram");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        
        Student1 s1 = new Student1();
        
        s1.setName("Sahil");
        s1.setAge(21);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    
    }
}
