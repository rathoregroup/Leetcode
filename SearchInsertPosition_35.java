public class SearchInsertPosition_35 {

    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            }
            
            if (nums[mid] < target){
                start = mid + 1;
            }
            else 
                end = mid - 1;
        }
        return end+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8};
        int t = 7;
        System.out.println(searchInsert(nums, t));
    }
}
