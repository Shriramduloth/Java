package inheritance;

class Demo1 {
    void disp() {
        System.out.println("Demo 1 class disp method ");
    }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{

}

public class multilevel_In {
public static void main(String[] args) {
    Demo3 d = new Demo3();
    d.disp();
}
}
