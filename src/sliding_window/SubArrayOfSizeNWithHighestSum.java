package sliding_window;

import java.util.Arrays;
import java.util.List;

public class SubArrayOfSizeNWithHighestSum {

    static int maximumSumSubarray(int K, List<Integer> Arr, int N) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (end < Arr.size()) {

            if (end - start + 1 < K) {
                sum += Arr.get(end);
                end++;
            } else if (end - start + 1 == K) {
                sum += Arr.get(end);
                maxSum = Math.max(maxSum, sum);
                end++;
            } else {
                sum -= Arr.get(start);
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(2, Arrays.asList(100, 200, 300, 400), 4));
    }
}
