public class Overloading {
    Overloading(int a, int b) {
        System.out.println("Parameterized constructor = " + (a + b));
    }

    Overloading() {
        System.out.println("Default constructor called");
    }

    int add(int a, int b) {
        return a + b;
    }

    long add(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading(2, 2);
        Overloading obj2 = new Overloading(); // Changed the variable name to obj2

        System.out.println(obj1.add(2, 2));
        System.out.println(obj1.add(2, 23));
    }
}
