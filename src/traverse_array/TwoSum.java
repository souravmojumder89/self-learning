package traverse_array;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {

        if (nums == null)
            return null;

        int left = 0;
        int right = nums.length - 1;
        int sum =0;
        while(right > left){
            sum = nums[right] + nums [left];
            if(sum > target){
                right --;
            } else if(sum < target){
                left++;
            } else {
                return new int [] {nums[right], nums [left]};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] result = findTwoSum(new int[]{1,2,3,5,6,7}, 11);
        for(int ele:result)
            System.out.print(ele+" ,");
    }
}
