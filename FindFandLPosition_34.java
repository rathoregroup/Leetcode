public class FindFandLPosition_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target));
    }
    public static int[] searchRange(int[] nums, int target) {
        int st = binarySearch(nums, target);
        if (st == nums.length || nums[st] != target){
            return new int[] {-1, -1};
        }

        int ed = binarySearch(nums, target + 1) - 1;
        return new int[] {st, ed};
    }

    static int binarySearch(int[] nums, int target){
        int st = 0;
        int ed = nums.length;

        while (st < ed){
            int mid = st + (ed - st) / 2;
            
            if (nums[mid] >= target){
                ed = mid;
            }
            else {
                st = mid + 1;
            }
        }
        return st;
    }
}
