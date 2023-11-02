package inheritance;

class Animal {
    void sleep() {
        System.out.println("Animal need sleep");

    }
}

class Tiger extends Animal {

}

class Monkey extends Animal {

}

class Lion extends Animal {

}

public class hierarchical {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
        Lion l = new Lion();
        l.sleep();
    }

}
