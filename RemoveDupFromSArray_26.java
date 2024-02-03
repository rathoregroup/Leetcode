import java.util.Arrays;

public class RemoveDupFromSArray_26 {
    public static void removeDuplicates(int []nums){
        int i = 0;

        for (final int num : nums)
        if (i < 1 || num > nums[i - 1])
            nums[i++] = num;
        System.out.println(Arrays.toString(nums));
    }
   
    public static void main(String[] args) {
        int[] n = {1,1,2};
        removeDuplicates(n);
    }
}
