
package polymorphism;

import java.util.Scanner;

abstract class shape {
    float area;

    abstract public void input();

    abstract public void compute();

    public void disp() {
        System.out.println("The area is " + area);
    }
}
class rectangle extends shape {
    float length;
    float breadth;

    public void input() {
        System.out.println("calculation of rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of rectangle");
        breadth = scan.nextFloat();

    }

    public void compute() {
        area = length * breadth;

    }
}
class square extends shape {
    float length;

    public void input() {
        System.out.println("calculation of square");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of square");
        length = scan.nextFloat();
        
    }

    public void compute() {
        area = length * length;

    }

}
class circle extends shape {
    float radius;


    public void input() {
        System.out.println("calculation of circle");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        radius = scan.nextFloat();
    
    }

    public void compute() {
        area = 3.14f*radius*radius;

    }

}
 class Geometry {
    public void poly(shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
 }
public class launchEffapp {
    public static void main(String[] args) {
     rectangle rec = new rectangle();
     square s = new square();
     circle c = new circle();
     Geometry  g= new Geometry();
     g.poly(rec);
     g.poly(s);
     g.poly(c);


    }
}
