import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("animal");
        list2.add("bird");

        for(int a: list1){             // for-each loop
            System.out.print(a+" ");

        }

        System.out.println();

        Iterator<Integer> itr = list1.iterator();
        Iterator<String> itr2 = list2.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
//
        while(itr.hasNext()){
            System.out.print(itr.next()+" .....");
        }

        System.out.println();

        while(itr2.hasNext()){
            System.out.print(itr2.next()+" .....");
        }

//..................................................................................................
        // For-each remaining method
        System.out.println();
        System.out.println();


        Iterator<Integer> itr3 = list1.iterator();
        Iterator<String> itr4 = list2.iterator();

        itr4.forEachRemaining(a -> /// without data type anonymous function
        System.out.print(a+" "));

    }
}
