package recursion;

public class Fibonnaci {

    private static int fib(int n) {
        if (n <= 1) return n;
       int t = fib(n - 1) + fib(n - 2);
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
