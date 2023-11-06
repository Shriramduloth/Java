package polymorphism;

// final class animal{
//     void sleep(){
//         System.out.println("animal needs sleep");
//     }
// }
class animal {
    final int age = 19;
     void sleep() {
        //age = 20; // cannot update final variable
        System.out.println("animal need sleep");
    }
}

class tiger extends animal {
    // void sleep(){
    // caannot override final method but it can be inherited
    // }

}

public class launch2_final {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.sleep();
    }

}