public class Main {
    public static void main(String[] args) {

        int arr1[][] = { {2,1,3},
                {5,2,1}
        };

        int arr2[][] = { {1,12,9},
                {5,7,9}
        };

        int total[][] = {{0,0,0},{0,0,0}};

        for(int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr1[i].length; j++){
                total[i][j] += arr1[i][j]+arr2[i][j];

            }
        }
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j< arr1[i].length; j++){
                System.out.print(total[i][j] +" ");
            }
            System.out.println();
        }
    }
}
