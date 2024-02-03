import java.util.*;

public class Sqrt_69 {
    public static void main(String[] args) {
        int x = 9;
        
        int l = 1;
        int r = x + 1;

        while (l < r) {
            int m = (l + r) / 2;

            if (m > x / m)
                r = m;
            else 
                l = m + 1;
        }
        
        System.out.println((int)l - 1);
    }
}
