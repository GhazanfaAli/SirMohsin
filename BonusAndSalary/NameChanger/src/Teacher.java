class Info{
    String name;
    int age;
    void swipe(Info name1, Info name2, Info name3){
        String name4 = name1.name;
        name1.name = name2.name;
        name2.name = name3.name;
        name3.name = name4;
    }
   boolean check(Info c){

        if(c.age == this.age){
            return true;
        }
        else{
            return false;
        }

   }
}

public class Teacher {

    public static void main(String args[]) {

        Info obj1 = new Info();
        Info obj2 = new Info();
        Info obj3 = new Info();
        obj1.age = 10;
        obj2.age = 9;
        obj1.name = "A";
        obj2.name = "B";
        obj3.name = "C";

        System.out.println("Name1 = "+obj1.name + " Name2 = "+obj2.name + " Name3 = "+obj3.name);
        obj1.swipe(obj1, obj2, obj3);
        System.out.println("Name1 = "+obj1.name + " Name2 = "+obj2.name + " Name3 = "+obj3.name);

        System.out.println( obj1.check(obj2));

    }
}
