package partition;

public class DutchFlag {

    public static void dutchFlag(int[] arr) {
        int leftBoundary = 0;
        int rightBoundary = arr.length - 1;
        int pivot = 1;
        int i = 0;
        while (i < rightBoundary) {
            if (arr[i] == pivot) {
                // do Nothing
                i++;
            } else if (arr[i] < pivot) {
                swap(arr, i, leftBoundary);
                leftBoundary++;
                i++;
            } else {
                swap(arr, i, rightBoundary);
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

        int[] arr = new int[]{2, 2, 1, 0, 2, 2, 1, 1, 0, 2, 0, 0, 1, 0};
        //0 ,0 ,1 ,0 ,0 ,2 ,2 ,2 ,2 ,2 ,1 ,1 ,1 ,0 ,
        //0 ,0 ,1 ,0 ,0 ,2 ,2 ,2 ,2 ,2 ,1 ,1 ,1 ,0 ,
        dutchFlag(arr);
        for (int a : arr) {
            System.out.print(a + " ,");
        }
    }
}
