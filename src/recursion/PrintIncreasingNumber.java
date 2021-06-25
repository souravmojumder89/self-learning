package recursion;

import java.util.Scanner;

public class PrintIncreasingNumber {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if (n == 0) return;
        printIncreasing(n - 1);
        System.out.println(n);

    }
}
