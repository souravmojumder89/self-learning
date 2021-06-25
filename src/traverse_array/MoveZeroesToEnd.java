package traverse_array;


public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{10,0,20,0,30,40,0,0};
        //0 ,0 ,1 ,0 ,0 ,2 ,2 ,2 ,2 ,2 ,1 ,1 ,1 ,0 ,
        //0 ,0 ,1 ,0 ,0 ,2 ,2 ,2 ,2 ,2 ,1 ,1 ,1 ,0 ,
        moveZeroesToEnd(arr);
        for (int a : arr) {
            System.out.print(a + " ,");
        }

    }

    private static void moveZeroesToEnd(int[] arr) {
        int zero = 0;
        int nonZero = 0;
        while (nonZero < arr.length) {

            if (arr[zero] == 0) {
                if (arr[nonZero] != 0 && nonZero>zero) {
                    swap(arr, zero, nonZero);
                    zero++;

                }
                nonZero++;

            } else {
                zero++;
            }
        }
    }

    private static void swap(int[] arr, int fromIndex, int toIndex) {
        int temp = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = temp;
    }
}
