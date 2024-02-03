public class BinarySearch_704 {
    public static void main(String[] args) {
        
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int ed = n - 1;

        while (st <= ed){
            int mid = st + (ed - st) / 2;

            if (nums[mid] == target){
                return mid;
            }

            if (nums[mid] > target){
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
}
