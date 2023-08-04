public class Main {

    int add(int a, int b){

        return  a+b;

    }
    float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {

        Main obj1 = new Main();
        System.out.println( obj1.add(2.2f, 2.2f));


    }
}