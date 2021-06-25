package recursion;

import java.util.Scanner;

public class PrintDecreasingNumber {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
