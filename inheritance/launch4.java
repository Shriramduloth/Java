package inheritance;

class parent4 {

    int a, b;

    parent4() {
        System.out.println("parent class constructor");
    }

    parent4(int x, int y) {
        System.out.println("parameterized constructor parent class");
        a = x;
        b = y;
    }
}

class child4 extends parent4 {
    int m, n;

    child4() {
        // super();
        // super(1,2);
        this(2, 3);
        System.out.println("child class constructor");
    }

    child4(int x, int y) {
        // super()
        System.out.println("parameterized constructor child class");
        m = x;
        n = y;

    }
}

public class launch4 {
    public static void main(String[] args) {
        child4 c4 = new child4();
        // child4 c = new child4(10,20);
    }
}
