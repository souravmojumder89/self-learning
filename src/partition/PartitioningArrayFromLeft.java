package partition;

public class PartitioningArrayFromLeft {

    public static void partitionArray(int[] arr) {
        int rightBoundary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[rightBoundary];
                arr[rightBoundary] = temp;

                rightBoundary++;
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 4, 5, 0, 1, 0, 2, 0, 3, 0, 4};

        partitionArray(arr);
        for(int a: arr){
            System.out.print(a+" ,");
        }
    }
}
