public class PowerOfTwo_231 {
    public static boolean powerOfTwo(int n){
        while (n > 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else if (n == 1)
                return true;
            else 
                break;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.print(powerOfTwo(n));
    }
}
