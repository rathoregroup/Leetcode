import java.util.Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] a = {2,2,1};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums){
        // int count = 1;
        // Arrays.sort(nums);

        // if (nums.length == 1){
        //     return nums[0];
        // } else {
        //     for (int i = 0; i < nums.length - 1; i++){
        //         if (nums[i] == nums[i + 1]){
        //             count++;
        //         } else {
        //             if (count == 1){
        //                 return nums[i];
        //             }
        //             count = 1;
        //         }
        //     }
        // return nums[nums.length - 1];
        // }

        int ans = 0;

        for (final int num : nums){
            ans ^= num;
            System.out.println(ans);
        }

        return ans;
    }
}
