package recursion;

public class TargetSumSubset {
    public static void main(String[] args) throws Exception {

         int [] arr = new int[]{10,20,30,40,50,60};
        printTargetSumSubsets(arr,0,"",0,70);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {

        //base case : when the whole array is traversed :
        if(idx == arr.length) {
            if(sos == tar)
                System.out.println(set);
            return;
        }
        // when u add the current value to be considered in the set
        printTargetSumSubsets(arr, idx + 1, set + arr[idx]+", ", sos + arr[idx], tar);
        // when u dont add the current value to be considered in the set
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);

    }

}
