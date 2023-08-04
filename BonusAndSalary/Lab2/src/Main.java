import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Main{

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add("speaker");
        list.add("computer");
        list.add("keyboard");
        list.add("mouse");

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list2.add(2);list2.add(3);
        list2.add(1);list2.add(4);
        System.out.println(list2);

        Collections.sort(list2);

        Collections.sort(list);

        System.out.println(list2);
        System.out.println(list);

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        list3.add(36);list3.add(34);list3.add(39);
        list4.add(34);list4.add(36);list4.add(39);

        System.out.println(list3.equals(list4));
        boolean out = list3.contains(34);
        System.out.println(out);

        System.out.println("Contains All = "+list3.containsAll(list4));





        Iterator<Integer> itr = list2.iterator();
        Iterator<Integer> itr2 = list2.iterator();


        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());



        list2.forEach(a -> /// without data type anonymous function
                System.out.print(a+" "));

        System.out.println();

        itr2.forEachRemaining(a -> /// without data type anonymous function
                System.out.print(a+" "));

        System.out.println();
        String s = "hello";
        s.concat(" wolrd"); /// it does not change because it's reference state is not change
        String t = s.concat(" wolrd"); /// it changes because it's reference state is change
        System.out.println(t);

        ListIterator listIterator = list.listIterator();
        System.out.println(list);
        System.out.println(listIterator.next());

        System.out.println(listIterator.previous());

        listIterator.add("hello");
        System.out.println(list);
        System.out.println(list.get(3));

///////////////////////////////////////////////////////
        /*
        The contentEquals() method searches a string to find out if it contains the exact same
        sequence of characters in the specified string or StringBuffer.
        Returns true if the characters exist and false if not.
         */
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello"));  // true
        System.out.println(myStr.contentEquals("e"));      // false
        System.out.println(myStr.contentEquals("Hi"));     // false


        /*
        .contentEquals()
        .contains
          .equals
          .size()
          .previous()
          .hasprevious()

          iterator()
          .get()
         */

    }
}
