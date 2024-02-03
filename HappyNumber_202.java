import java.util.HashSet;

public class HappyNumber_202 {
    public static boolean happyNum(int n){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while (true){
            n = squareSum(n);
            if (n == 1){
                return true;
            }
            else if (set.contains(n)){
                return false;
            }
            set.add(n);
        }
        
    }

    public static int squareSum(int n){
        int sum = 0;
        while (n != 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(happyNum(n));
    }


//google solution best way to solve. completely tested. Easily understandable.
    public boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));
    
        while (slow != fast) {
          slow = squaredSum(slow);
          fast = squaredSum(squaredSum(fast));
        }
    
        return slow == 1;
      }
    
      private int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
          sum += Math.pow(n % 10, 2);
          n /= 10;
        }
        return sum;
      }
}
