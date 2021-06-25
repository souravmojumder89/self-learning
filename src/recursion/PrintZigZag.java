package recursion;

public class PrintZigZag {

    public static void main(String[] args) {
        pzz(2);
    }

    private static void pzz(int n) {

        if (n == 0) return;
        System.out.println("PRE : " + n);
        pzz(n - 1);
        System.out.println("IN : " + n);
        pzz(n - 1);
        System.out.println("POST : " + n);
    }
}
