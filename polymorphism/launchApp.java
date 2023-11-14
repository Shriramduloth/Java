package polymorphism;

import java.util.Scanner;

class rectangle1 {
    float length;
    float breadth;
    float area;

    public void input() {
        System.out.println("calculation of rectangle");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the length of rectangle");
            length = scan.nextFloat();
            System.out.println("Please enter the breadth of rectangle");
            breadth = scan.nextFloat();
        }

    }

    public void compute() {
        area = length * breadth;

    }

    public void disp() {
        System.out.println("The area of rectangle is " + area);
    }
}
class square1 {
    float length;
    float area;

    public void input() {
        System.out.println("calculation of square");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the length of square");
            length = scan.nextFloat();
        }
        
    }

    public void compute() {
        area = length * length;

    }

    public void disp() {
        System.out.println("The area of square is " + area);
    }
}
class circle1 {
    float radius;
    float area;

    public void input() {
        System.out.println("calculation of circle");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the radius of circle");
            radius = scan.nextFloat();
        }
    
    }

    public void compute() {
        area = 3.14f*radius*radius;

    }

    public void disp() {
        System.out.println("The area of circle is " + area);
    }
}

public class launchApp {
    public static void main(String[] args) {
        rectangle1 rec = new rectangle1();
        rec.input();
        rec.compute();
        rec.disp();
        square1 s = new square1();
        s.input();
        s.compute();
        s.disp();
        circle1 c = new circle1();
        c.input();
        c.compute();
        c.disp();
        

    }
}
