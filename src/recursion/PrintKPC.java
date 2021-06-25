package recursion;

import java.util.HashMap;
import java.util.Map;

public class PrintKPC {
    private static Map<String, String> keyStrokeMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        keyStrokeMap.put("0", ".;");
        keyStrokeMap.put("1", "abc");
        keyStrokeMap.put("2", "def");
        keyStrokeMap.put("3", "ghi");
        keyStrokeMap.put("4", "jkl");
        keyStrokeMap.put("5", "mno ");
        keyStrokeMap.put("6", "pqrs");
        keyStrokeMap.put("7", "tu");
        keyStrokeMap.put("8", "vwx");
        keyStrokeMap.put("9", "yz");

        printKPC("78","");
    }

    public static void printKPC(String str, String result) {

        //base condition
        if (str.length() == 0) {
            System.out.print(result+" , ");
            return;
        }
        char firstStr = str.charAt(0);
        String subStr = str.substring(1);
        String options = getString(Character.toString(firstStr));
        for (char eachStr : options.toCharArray()) {
            printKPC(subStr, result + eachStr);
        }
    }

    public static String getString(String key) {
        return keyStrokeMap.get(key);
    }
}
