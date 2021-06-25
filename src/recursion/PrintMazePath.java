package recursion;

import java.util.Scanner;

public class PrintMazePath {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        printMazePaths(m, n, 3, 3, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        //basecase :
        if (sc == dc && sr == dr) {
            System.out.println(psf);
        }
        //horizontal Paths :
        if (sc < dc)
            printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        if (sr < dr)
            printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    }
}
