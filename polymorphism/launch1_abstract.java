package polymorphism;

abstract class aeroPlane1 {
    // abstract int age;
    // abstract aeroPlane1();
    abstract public void takeOff();

    abstract public void fly();

    public void landing() {
        System.out.println("plane is landing");
    }
}

class cargoPlane1 extends aeroPlane1 {
    public void takeOff() {
        System.out.println("cargoplane need long runway");
    }

    public void fly() {
        System.out.println("cargoplane flies at lower height");
    }

    public void alert() {
        System.out.println("Alert....");
    }
}

class passengerPlane1 extends aeroPlane1 {
    public void takeOff() {
        System.out.println("passengerplane need medium runway");
    }

    public void fly() {
        System.out.println("cargoplane flies at higher height");
    }

}

public class launch1_abstract {
    public static void main(String[] args) {
        aeroPlane1 ref = new cargoPlane1();

        ref.takeOff();
        ref.fly();
        ref.landing();
        ((cargoPlane1) ref).alert(); // downcasting is used

        aeroPlane1 ref1 = new passengerPlane1();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();

    }
}
