import java.util.*;

public class PowerOfThree_326 {
    public static void main(String[] args) {
        int n = -1;
        
        boolean flag = false;
        int i = 0;
        
        while (n != 0){
            
            int x = (int)Math.pow((double)3, i);
            double a = (double)n / x;
            
            if (a == 1 && n > 0){
                flag = true;
                break;
            }

            if (x > n){
                break;
            }
            i++;
        }
        if (flag){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
