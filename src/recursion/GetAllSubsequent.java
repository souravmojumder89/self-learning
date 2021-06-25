package recursion;

import java.util.ArrayList;
import java.util.List;

public class GetAllSubsequent {

    public static void main(String[] args) throws Exception {

        System.out.println(gss("yvTA"));
    }

    //faith --> gss(abc) = a*gss(bc)
    public static ArrayList<String> gss(String str) {
        //in case of base condition which is : when the string is empty -- return an arraylist with blank string
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char firstChar = str.charAt(0);
        String subStr = str.substring(1);
        List<String> recursiveResult = gss(subStr);

        ArrayList<String> result = new ArrayList<>();
        for (String rStr : recursiveResult)
            result.add(rStr);
        for (String rStr : recursiveResult)
            result.add(firstChar + rStr);
        return result;

    }
}
