package recursion;

public class DisplayArrayInReverse {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        displayArrInReverse(arr, 0);
    }

    public static void displayArrInReverse(int[] arr, int idx) {

        if (arr.length == idx) return;
        int i = idx;
        displayArrInReverse(arr, ++idx);
        System.out.println(arr[i]);

    }
}
