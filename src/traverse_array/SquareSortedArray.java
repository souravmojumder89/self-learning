package traverse_array;

public class SquareSortedArray {

    public static void squareTheSortedArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (right >= left) {
            if ((nums[left] * nums[left]) > (nums[right] * nums[right])) {
                // swap
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right--] = temp * temp;
            } else {
               nums[right] = nums[right] * nums[right];
                right--;

            }

        }
    }

    public static void main(String[] args) {
        int [] nums = {-5,-3,-2,-1};
        squareTheSortedArray(nums);
        for (int ele: nums)
            System.out.print(ele+", ");


    }
}
