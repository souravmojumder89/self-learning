package misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathChallenge {
    public static int MathChallenge(int number) {
        // code goes here
        int num = Integer.valueOf(number);
        int temp = num;
        int size = String.valueOf(number).length();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i+1]){
                swap(numbers, i, i + 1);
                int numberFromList = getNumberFromList(numbers);
                if (numberFromList > temp)
                    return numberFromList;
            }

        }
        return -1;
    }

    private static int getNumberFromList(int[] numbers) {
        int num = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            num = (num * 10) + numbers[i];
        }
        System.out.println(num);
        return num;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
      //  System.out.print(MathChallenge(s.nextLine()));
    }
}