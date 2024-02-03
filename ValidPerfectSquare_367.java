public class ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int num){
        long x = 1;
        long y = num;

        while (x < y){
            long m = (x + y) / 2;
            if (m >= num / m){
                y = m;
            }
            else{
                x = m + 1;
            }
        }
        return x * x == num;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
}
