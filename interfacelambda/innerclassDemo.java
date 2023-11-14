package interfacelambda;
class A {
    public void show() {
        System.out.println("in show");
    }

    class B {
        public void disp() {
            System.out.println("in display");
        }
    }
}

public class innerclassDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.disp();

    }
}
