package misc;

public class palindrome {
    public static String StringChallenge(String str) {
        // code goes here
        String removedStr = null;
        for (int i = 0; i < str.length(); i++) {
            removedStr = "" + str.charAt(i);
            String firstRemainingStr = getStringWithoutIndexedChar(str, i);

            if (isPalindromeString(firstRemainingStr)) {
                return removedStr;
            } else {
                for (int j = 0; j < str.length() && j != i; j++) {
                    String secondRemovedStr = firstRemainingStr.charAt(j) + removedStr;
                    String secondRemainingStr = getStringWithoutIndexedChar(firstRemainingStr, j);
                    if (isPalindromeString(secondRemainingStr)) {
                        return secondRemovedStr;
                    }
                }
            }
            removedStr = null;
        }
        return "not possible";
    }

    private static String getStringWithoutIndexedChar(String str, int i) {
        char[] newStr = new char[str.length() - 1];

        int counter = 0;
        for (int j = 0; j < str.length(); j++) {
            if (j != i) {
                newStr[counter] = str.charAt(j);
                counter++;
            }
        }
        String res = String.valueOf(newStr);
        return res;
    }


    private static boolean isPalindromeString(String input) {
        if(input.length()<3) return false;
        int l = 0;
        int r = input.length() - 1;
        while (l < r) {
            if (input.charAt(l) != input.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(StringChallenge("abjchba"));
        int x = 1, y = 1, z = 0;
        if (x == y | x < ++y) {
            z = x+y;
        }
        else{
            z = 1;
        }
        System.out.println(z);

    }
}
