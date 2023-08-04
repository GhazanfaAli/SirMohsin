public class Main {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10,
                k = 11, l = 12, m = 13, n = 14, o = 15, p = 16, q = 17, r = 18, s = 19, t = 20;

        int[][] arr1 = new int[10][2];



        arr1[0] = new int[]{a, b};
        arr1[1] = new int[]{c, d};
        arr1[2] = new int[]{e, f};
        arr1[3] = new int[]{g, h};
        arr1[4] = new int[]{i, j};
        arr1[5] = new int[]{k, l};
        arr1[6] = new int[]{m, n};
        arr1[7] = new int[]{o, p};
        arr1[8] = new int[]{q, r};
        arr1[9] = new int[]{s, t};

        for (int len = 0; len < arr1.length; len++) {
            System.out.println(arr1[len][0] + " " + arr1[len][1]);
        }
    }
}
