public class NumberofSteps_1342 {
    public static void main(String[] args) {
        int num = 14;
        int sum = 0;
        System.out.println(count(num));
    }
    static int count(int n){
        if (n == 0){
            return 0;
        }

        
        return 1 + ((n % 2 == 0) ? count(n / 2) : count(n - 1));
    }
}
