//public class Main {
//    int age;
//    String name;
//
//    public static void main(String[] args) {
//
//        Main obj1= new Main();
//        Main obj2= new Main();
//        obj1.age = 12;
//        obj1.name = "ali";
//        obj2.age = obj1.age;
//        obj2.name = obj1.name;
//        System.out.println(obj2.name + " " +obj1.age);
//
//    }
//}


public class Main {
    int age;
    String name;

    Main object(String name, int age) {
        Main temp = new Main();
        temp.age = this.age;
        temp.name = this.name;
        return temp;
    }


    public static void main(String[] args) {

        Main obj1 = new Main();
        obj1.age = 12;
        obj1.name = "ali";

        // Provide arguments for the object() method call
        Main obj2 = obj1.object("....", 25);

        System.out.println(obj2.name + " " + obj2.age);



        System.out.println(obj1.name + " " +obj1.age);

    }
}