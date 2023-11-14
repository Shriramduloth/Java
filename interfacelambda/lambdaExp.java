package interfacelambda;
@FunctionalInterface
interface car1{
    void drive(int avg, int ts);
}
public class lambdaExp {
    public static void main(String[] args) {
        car1 obj = (avg,ts)->System.out.println("Driving ..."+ avg+":"+ts);
            

        obj.drive(16,150);
    }
}
