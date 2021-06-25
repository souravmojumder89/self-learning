package traverse_array;

public class RemoveDuplicates {

    public static int removeDuplicatesInAnArray(int[] nums) {

        int high = 0;
        int low = 0;

        while(high< nums.length){
            if(nums[high] != nums[low]){
                nums[++low] = nums[high];
            }
            high++;
        }
    return low+1;
    }

    public static void main(String[] args) {

        int [] nums = new int[] {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicatesInAnArray(nums));

        for(int ele : nums)
            System.out.print(ele+ ", ");

    }
}

