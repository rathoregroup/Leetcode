import java.util.*;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int []left = new int[arr.length]; 
        int []right = new int[arr.length]; 

        left[0] = 1;

        for (int i = 1; i < arr.length; i++){
            left[i] = left[i-1]*arr[i-1];
        }
        // System.out.println(Arrays.toString(left));

        right[arr.length - 1] = 1;
        for (int i = arr.length-2; i >= 0; i--){
            right[i] = right[i+1]*arr[i+1];
        }
        // System.out.println(Arrays.toString(right));
        for (int i=0; i<arr.length; i++){
            left[i] = left[i] * right[i];
        }
        // System.out.println(Arrays.toString(left));
    }
}
