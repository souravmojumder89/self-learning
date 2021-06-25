package recursion;

import java.util.ArrayList;

public class MazePathsWithJump {
    public static void main(String[] args) throws Exception {
        System.out.println(getMazePaths(0,0,3,3));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        //base condition :
        if (sr == dr && sc == dc) {
            ArrayList<String> bResult = new ArrayList<>();
            bResult.add("");
            return bResult;
        }
        //all paths :
        ArrayList<String> paths = new ArrayList<>();

        //horizontal paths

        for (int moveSize = 1; moveSize <= dc - sc; moveSize++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc + moveSize, dr, dc);
            for (String hPath : hPaths)
                paths.add("h" + moveSize + hPath);
        }

        //vertical paths :
        for (int moveSize = 1; moveSize <= dr - sr; moveSize++) {
            ArrayList<String> vPaths = getMazePaths(sr + moveSize, sc, dr, dc);
            for (String vPath : vPaths)
                paths.add("v" + moveSize + vPath);
        }
        //diagonal paths :
        for (int moveSize = 1; moveSize <= dr - sr && moveSize <= dc - sc; moveSize++) {
            ArrayList<String> dPaths = getMazePaths(sr + moveSize, sc + moveSize, dr, dc);
            for (String dPath : dPaths)
                paths.add("d" + moveSize + dPath);
        }
        return paths;
    }
}
