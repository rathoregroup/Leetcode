public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n){
        int a = 1;
        int b = 1;

        for (int i = 2; i <= n; i++){
            int next = a + b;
            b = a;
            a = next;
        }
        return a;
    }
}
