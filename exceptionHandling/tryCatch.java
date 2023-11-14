package exceptionHandling;

public class tryCatch {
    public static void main(String[] args) {

        int num = 10;
        int result = 0;
        int values[] ={2,4,6,7};
        String name= "null";

        try {
            result = num / name.length();
            System.out.println(values[7]);

        } 
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(values[values.length-1]);
            System.out.println("stay in your limits");
        }
        catch (Exception e) {
            System.out.println("sommething went wrong "+e);
        }
        System.out.println(result);
        System.out.println("bye");
    }
}
