import java.util.StringJoiner;

class Calculator{

    int add(int a, int b){
        return a + b;
    }
    int subtract(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }
    int division(int a, int b){
        return a / b;
    }
    int module(int a, int b){
        return a % b;
    }
    int parallelogramArea(int base, int height) {
        return base * height;
    }

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        System.out.println(obj1.add(2, 2));
        System.out.println(obj1.subtract(33, 3));
        System.out.println(obj1.multiply(32, 2));
        System.out.println(obj1.division(22, 2));
        System.out.println(obj1.module(12, 2));
        System.out.println(obj1.parallelogramArea(34, 23));

        System.out.println(obj1.circleArea(5.0));
        System.out.println(obj1.triangleArea(10.0, 8.0));
    }
}