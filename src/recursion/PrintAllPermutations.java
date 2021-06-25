package recursion;

import java.util.Scanner;

public class PrintAllPermutations {
    public static void main(String[] args) throws Exception {
        printPermutations(new Scanner(System.in).next(), "");
    }

    public static void printPermutations(String str, String result) {

        //BaseCase : when str is empty
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.toCharArray().length; i++) {

            String leftOfIndex = str.substring(0, i);
            String rightOfIndex = str.substring(i + 1);
            printPermutations(leftOfIndex + rightOfIndex, result + str.charAt(i));

        }


    }
}
