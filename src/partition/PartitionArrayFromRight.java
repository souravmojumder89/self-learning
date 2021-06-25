package partition;

public class PartitionArrayFromRight {

    public static void partitionArray(int[] arr, int pivot) {

        int rightBoundary = arr.length - 1;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] == pivot) {
                //swap
                int temp = arr[i];
                arr[i] = arr[rightBoundary];
                arr[rightBoundary] = temp;

                rightBoundary--;
            }

        }

    }

    private static void swap(int[] arr, int fromIndex, int toIndex) {

        int temp = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 0, 4, 0, 0, 2, 0, 2, 0, 3, 2, 4};
        partitionArray(arr, 2);
        for (int a : arr) {
            System.out.print(a + " ,");
        }
    }
}