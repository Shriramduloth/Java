package inheritance;

class Aeroplane {
    void takeOff() {
        System.out.println("Aeroplane is taking off");
    }

    void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class cargoPlane extends Aeroplane {
    public void fly() {
        System.out.println("Aeroplane is flying at lower height");
    }

    void carryGoods() {
        System.out.println("Cargoplane carries goods");
    }
}

class passengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("Aeroplane is flying at medium height");
    }

    void carryPassenger() {
        System.out.println("Passenger plane carries passenger");
    }
}

public class launch2 {
    public static void main(String[] args) {
     cargoPlane cp= new cargoPlane();
     cp.takeOff();
     cp.fly();
     cp.carryGoods();

     passengerPlane pp = new passengerPlane();
     pp.takeOff();
     pp.fly();
     pp.carryPassenger();
    }
}
