package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class eception1 {
    public static void main(String[] args) {

        int num = 0;
        // Scanner sc = new Scanner(System.in);
        // try with resources
        try (Scanner sc = new Scanner(System.in);) {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("enter a number");
        }
        // finally{
        // sc.close();
        // System.out.println("Resources are closed");
        // }
        System.out.println(num);
    }
}
