package recursion;

public class PrintAllSubSequence {
    public static void main(String[] args) throws Exception {
        printSS("abcd", "");
    }

    public static void printSS(String str, String ans) {

        //base case when str length == 0
        if (str.length() == 0) { // 5
            System.out.println(ans);
            return;
        }
        char firstChar = str.charAt(0); //1
        String subSequence = str.substring(1);

        printSS(subSequence, ans + firstChar);//2
        printSS(subSequence, ans); //4

    }
}