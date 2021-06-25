package recursion;

import java.util.ArrayList;

public class StairPaths {
    public static void main(String[] args) throws Exception {
        System.out.println(getStairPaths(4));

    }

    public static ArrayList<String> getStairPaths(int n) {
        /*base case : if n =0 that means u are already at desination & need no step further
        However if the n = -1, -2 OR less than zero .. that means u are basement u cant jump in 1, 2 OR 3 stepped to return to destination
         hence in this case the paths arrayList should be empty.*/
        if (n == 0) {
            ArrayList<String> bResult = new ArrayList<>();
            bResult.add("");
            return bResult;
        } else if (n < 0) {
            ArrayList<String> bResult = new ArrayList<>();
            return bResult;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> result = new ArrayList<>();

        for (String path : paths1)
            result.add("1" + path);
        for (String path : paths2)
            result.add("2" + path);
        for (String path : paths3)
            result.add("3" + path);

        return result;
    }
}
