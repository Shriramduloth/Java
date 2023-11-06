package polymorphism;

class aeroplane {
    public void takeOff() {
        System.out.println("aeroplane is taking off");
    }

    public void fly() {
        System.out.println("aeroplane is flying");
    }
}

class cargoPlane extends aeroplane {
    public void takeOff() {
        System.out.println("cargoplane needs long runway");
    }

    public void fly() {
        System.out.println("cargoplane carries goods");
    }
}

class passengerPlane extends aeroplane {
    public void takeOff() {
        System.out.println("passengerplane needs medium runway");
    }

    public void fly() {
        System.out.println("passengerplane carries passenger");
    }
}

class fighterPlane extends aeroplane {
    public void takeOff() {
        System.out.println("fighterplane needs short runway");
    }

    public void fly() {
        System.out.println("fighterplane fights in war");
    }
}

class airPort {
    public void poly(aeroplane ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("-----------------------------------------------");

    }
}

public class launch {
    public static void main(String[] args) {
        airPort a = new airPort();
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

    }

}
