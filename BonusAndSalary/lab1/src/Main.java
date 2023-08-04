import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        int[] arr1 = new int[5];

        for(int i = 0; i<5; i++){
            arr1[i] = obj1.nextInt();
        }

        for(int j = 0; j<5; j++){
            System.out.print(arr1[j]+" ");

        }
    }
}