import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row = twoDArray.length;
        int col = twoDArray[0].length;
        int total = row*col;
        int[] arr = new int[total];

        int index = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr[index] = twoDArray[i][j];
                index++;
            }

        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}