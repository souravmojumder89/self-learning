package traverse_array;

public class ReverseArray {

    public static void reverseAnArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int fromIndex, int toIndex) {

        int temp = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = temp;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {3,5,2,5,2,3,9};// 9 ,3 ,2 ,5 ,2 ,5 ,3
        reverseAnArray(arr);

        for(int element : arr)
            System.out.print(element+" ,");
    }
}
