import java.util.*;

public class KthMissingPositiveNumber_1539 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int k = 2;
        int [] b = new int[k];
        int i = 1;
        int j = 0;
        int counter = 0;
        while(true){
            if (a[j] != i){
                b[counter] = i;
                counter++;
            }
            else{
                j++;
            }
            if (counter == k){
                break;
            }
            i++;
        }

        System.out.println(b[b.length - 1]);
        // System.out.println(Arrays.toString(b));
    }
}
