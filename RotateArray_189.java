import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7};
        int k = 50;
        k = k % arr.length; 
        swap(arr,0,arr.length-1);
        swap(arr, 0, k-1);
        swap(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int [] arr, int st, int ed){
        while (st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
}
