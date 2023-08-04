public class Main {
    public static void main(String[] args) {

        int a[][] = new int[501][2];

        for(int i = 0, j = 500; i<=500; i++, j--){
            a[i][0] = i;
            a[i][1] = j;

                System.out.println(a[i][0] + "    "+a[i][1]);




        }

    }
}