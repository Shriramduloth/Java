package inheritance;

class Animal1 {
    void show(){
        System.out.println("Animal need sleep");
    }
}

class Tiger1 extends Animal1{

}
public class single_In {
    public static void main(String[] args) {
        Tiger1 t = new Tiger1();
        t.show();
    }


}
