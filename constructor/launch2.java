package constructor;



class Demo {
    private int a;
    private int b;

    public Demo() {
        System.out.println("Zero parameterized constructor");
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }

}

public class launch2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.disp();
        Demo d1 = new Demo(10,12);
        d1.disp();
    }
        

}
