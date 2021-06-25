package recursion;

import java.util.Scanner;

public class PrintMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        printMazePathsWithJumps(1, 1, dr, dc, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {

        //Base case :
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        //Horizontal Paths
        for (int i = 1; i <= dc - sc; i++) {
            printMazePathsWithJumps(sr, sc + i, dr, dc, psf + "h" + i);
        }

        //Vertical Paths
        for (int i = 1; i <= dr - sr; i++) {
            printMazePathsWithJumps(sr + i, sc, dr, dc, psf + "v" + i);
        }

        //Diagonal Paths
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            printMazePathsWithJumps(sr + i, sc + i, dr, dc, psf + "d" + i);
        }
    }
}