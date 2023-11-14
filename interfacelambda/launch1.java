package interfacelambda;
interface A{
    void show();
}
interface B{
    void abc();
}
class X implements A,B{
    public void show(){
    System.out.println("in show");}
    public void abc(){
    System.out.println("in abc");}
}
public class launch1 {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        obj.abc();
    }
}
