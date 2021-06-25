package recursion;

public class PrintStairPaths {

    public static void main(String[] args) throws Exception {
        printStairPaths(5, "");
    }

    public static void printStairPaths(int n, String path) {
        //base case
        if (n < 0) return;
        else if (n == 0) {
            System.out.println(path);
            return;
        }
        printStairPaths(n - 1, path + 1);
        printStairPaths(n - 2, path + 2);
        printStairPaths(n - 3, path + 3);


    }
}