import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] array = {9,9};
        System.out.println(Arrays.toString(plusOne(array)));
    }

    public static int[] plusOne(int []digits){
        for (int i = digits.length - 1 ; i >= 0; i--){
            if (digits[i] < 9){
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        return digits;
    }
}
