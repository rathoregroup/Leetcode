import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (int num : nums){
            ans = num;
            count += num == ans ? 1 : -1;
        }
        return ans;
    }
}
