package Static;

import java.util.Scanner;

class farmer {
    int pa;
    float td;
    static float ri;
    float si;
    static {
        ri = 8.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please mention the amount required");
        pa = scan.nextInt();
        System.out.println("Please mention time duration ");
        td = scan.nextFloat();

    }

    void calc() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("Simple interest is " + si);
    }
}

public class launchfarmer {

    public static void main(String[] args) {
        farmer f1 = new farmer();
        f1.input();
        f1.calc();
        f1.disp();
        farmer f2 = new farmer();
        f2.input();
        f2.calc();
        f2.disp();

    }
}


