package recursion;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args) throws Exception {

        System.out.println(getMazePaths(1, 1, 3, 3));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        /*when the base case is reached i.e. the dr & dc are reached then the number of steps is empty*/
        if (sr == dr && sc == dc) {
            ArrayList<String> bResult = new ArrayList<>();
            bResult.add("");
            return bResult;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();

        if (sc < dc )
            hPaths = getMazePaths(sr, sc + 1, dr, dc);
        if (sr < dr)
            vPaths = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> result = new ArrayList<>();

        for (String hPath : hPaths)
            result.add("h" + hPath);
        for (String vPath : vPaths)
            result.add("v" + vPath);

        return result;

    }
}
