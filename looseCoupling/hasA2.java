package looseCoupling;

class car{
private engine e;
public car(engine e){
    this.e= e;
}
// dependency injection using two types constructor or setter
// public void setE(engine e)
// {
//     this.e=e;
// }
public void carStart(){
    e.start();
}
}
class engine{
    public void start(){
        System.out.println("engine starts");
    }
}
public class hasA2 {
    public static void main(String[] args) {
        engine e = new engine();
        car c= new car(e);
        c.carStart();
    }
}
