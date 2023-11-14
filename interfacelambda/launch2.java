package interfacelambda;

interface Computer {
    void compileCode();
}
class Desktop implements Computer {
    public void compileCode() {
        System.out.println("you got 5 errors , faster");
    }
}

class Laptop implements Computer{
    public void compileCode() {
        System.out.println("you got 5 errors");
    }
}

class Developer {
    public void develop(Computer obj) {
        System.out.println("Building apps");
        obj.compileCode();
    }
}

public class launch2 {
    public static void main(String[] args) {
        Developer d = new Developer();
        //Laptop obj = new Laptop();
        Computer obj = new Desktop();
        d.develop(obj);
    }
}
