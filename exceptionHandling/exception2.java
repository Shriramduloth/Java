package exceptionHandling;
//handling vs ducking exception
class Demo {
    public void a() throws Exception {
        // try {
        b();
        // }
        // catch (Exception e) {
        // System.out.println("error "+e.getMessage());
        // }
    }

    // {
    //     // TODO: handle exception
    // }

    public void b() throws Exception {
        int num = 6;
        int num1 = 0;
        // try {
        int result = num / num1;
        System.out.println(result);
        // }
        // catch (Exception e) {
        // System.out.println("error " + e.getMessage());
        // }

    }
}

public class exception2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            d.a();
        } catch (Exception e) {
            System.out.println("error "+ e.getMessage());
        }
    }
}
