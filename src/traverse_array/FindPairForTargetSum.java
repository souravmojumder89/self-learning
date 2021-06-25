package traverse_array;

//Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
public class FindPairForTargetSum {

    public static Pair findPairForGivenTargetSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int valueToFind = target - nums[left];
            if (valueToFind < nums[right]) right--;
            else if (valueToFind > nums[right]) left++;
            else return new Pair(nums[left], nums[right]);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int target = 10;

        System.out.println(findPairForGivenTargetSum(nums, target));
    }
}

class Pair {

    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}