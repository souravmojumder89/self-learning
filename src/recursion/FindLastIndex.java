package recursion;

public class FindLastIndex {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 50, 90, 40, 50, 900, 222, 1290, 50, 100, 200, 300, 50};
        System.out.println(lastIndex(arr, 0, 1290));
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length - 1) return -1;
        int lastIndex = lastIndex(arr, ++idx, x);
        if (arr[idx] == x)
            lastIndex = Math.max(idx, lastIndex);
        return lastIndex;
    }
}
