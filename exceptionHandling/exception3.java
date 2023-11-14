package exceptionHandling;

class Myexception extends Exception {
    public Myexception() {

    }

    public Myexception(String msg) {
        super(msg);
    }
}

public class exception3 {
    public static void main(String[] args) {
        int num = 6;
        int num1 = -1;
        try {
            if (num1 < 0) {
                Exception e = new Myexception("Negative number");
                throw e;
            } else {

                int result = num / num1;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("enter a valid number " + e.getMessage());

        }

    }
}
