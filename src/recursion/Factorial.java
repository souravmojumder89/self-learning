package recursion;

public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int f = n * factorial(n - 1);
        return f;
    }
}
