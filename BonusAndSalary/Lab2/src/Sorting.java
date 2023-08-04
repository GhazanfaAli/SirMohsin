import java.util.*;

public class Sorting {

    public static void main(String[] args) {


        int[] myArray = {4, 2, 7, 1, 3};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray)); // Output: [1, 2, 3, 4, 7]

        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println();

        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(9);
        myList.add(1);
        myList.add(2);
        Collections.sort(myList);
        System.out.println(myList); // Output: [1, 2, 3, 4, 7]


    }
}