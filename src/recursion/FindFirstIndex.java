package recursion;

public class FindFirstIndex {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 50, 90, 40, 50, 900, 222, 1290, 50, 100, 200, 300, 50};
        System.out.println(firstIndex(arr, 0, 50));
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) return -1;
        if (arr[idx] == x) return idx;
        else return firstIndex(arr, ++idx, x);
    }
}
