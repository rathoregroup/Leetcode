public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int f = n * (n + 1) / 2;    //imp formula
        int sum = 0;
        for (int ele : nums){
            sum += ele;
        }
        return f - sum;
    }
}
