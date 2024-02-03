import java.util.Arrays;

public class DuplicateNumber_287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
    }

    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
                count++;
            }
            if (count > 1){
                return nums[i];
            }
        }
        return -1;

        // int len = nums.length;
        // for (int num : nums) {
        //     int idx = Math.abs(num);
        //     if (nums[idx] < 0) {
        //         return idx;
        //     }
        //     nums[idx] = -nums[idx];
        // }

        // return len;
    }
}
