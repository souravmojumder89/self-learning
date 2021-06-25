package recursion;

public class PrintArrayRecursively {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx) {

        if (arr.length == idx) return;
        System.out.println(arr[idx]);
        displayArr(arr, ++idx);

    }
}
