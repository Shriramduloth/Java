package Static;


class Demo{
    static void disp1(){
        System.out.println("Static display 1");
    }
    void disp2 (){
        System.out.println("Non static display 2");
    }
    
}

public class launch2 {
public static void main(String[] args) {
        Demo.disp1();
        //Demo.disp2();
        Demo d = new Demo();
       // d.disp1();
        d.disp2();
    }
}
