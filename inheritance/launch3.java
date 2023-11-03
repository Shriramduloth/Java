package inheritance;

class Animal2{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
    public void age(){
        System.out.println("Animal age is ");
    }
}

class Tiger2 extends Animal2
{//cannot decrease visibility means cannot change from public to private or default
    public void eat(){
        System.out.println("Tiger hunts everyday");
    }
    //public int age() cannot change datatype
    public void age(){
        System.out.println("Tiger age is ");
    }
}


public class launch3 {
    public static void main(String[] args) {
        Tiger2 t = new Tiger2();
        t.eat();
    }
}
