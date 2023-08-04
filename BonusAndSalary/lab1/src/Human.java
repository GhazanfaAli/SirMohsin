import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Human {

    public static void main(String args[]) {


        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        int res = a / 5000;
        int res2 = (a % 5000) / 1000;
        int res3 = a % 1000;
        System.out.println("amount in 5000 notes = " + res);
        System.out.println("amount in 1000 notes = " + res2);
        System.out.println("remaining amount = " + res3);
    }
}