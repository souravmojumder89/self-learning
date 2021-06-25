package traverse_array;

public class LeftRotateByN {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        rotateArrayByN(arr, 5);
        for (int a : arr) {
            System.out.print(a + " ,");
        }
    }

    private static void rotateArrayByN(int[] arr, int n){
        for(int i=0; i<n;i++){
            int temp = arr[0];
            int length = arr.length;
            for(int j=1;j<length;j++)
                arr[j-1] = arr[j];
            arr[length-1] = temp;
        }
    }
}
