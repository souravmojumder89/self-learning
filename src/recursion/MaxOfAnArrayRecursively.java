package recursion;

public class MaxOfAnArrayRecursively {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 90, 40, 50, 900, 222, 1290};
        System.out.println(maxOfAnArray(arr, 0));
    }

    public static int maxOfAnArray(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return Math.max(arr[idx], maxOfAnArray(arr, ++idx));
    }
}
