package Static;

public class launch1 {

    static int age;
    static {
        age = 18;
        System.out.println("static block");
        System.out.println(age);
    }

    static void disp()
    {
        System.out.println("static disp method");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        
        disp();
    }
}
