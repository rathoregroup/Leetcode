public class UglyNumber_263 {
    public static boolean isUgly(int n){
        while (n != 1){
            if (n == 1){
                return true;
            }
            if (n % 2 == 0){
                n = n / 2;
            }
            else if (n % 3 == 0){
                n = n / 3;
            }
            else if (n % 5 == 0){
                n = n / 5;
            }
            else {
                break;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(isUgly(n));
    }
}