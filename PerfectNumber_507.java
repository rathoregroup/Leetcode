public class PerfectNumber_507 {

    public static boolean checkPerfectNumber(int num){
        int sum = 0;     
        for (int i = 1; i <= num / 2; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        return sum == num ? true : false;
    }
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber (num));
    }
}
