public class DivideTwoInteger_29 {

    public static int divide(int a, int b){
        int count = 0;
        int c, d;

        if (b < 0) c = -(b);
        else c = b;

        if (a < 0) d = -(a);
        else d = a;

        if (d < c)
            return 0;
        while (true){
            d -= c;
            count++;
            if (d > 0 && d < c){
                break;
            }
            if (d == 0){
                return ans(a, b, count);
            }
        }
        return ans(a, b, count);
    }

    public static int ans(int a, int b, int ans){
        if (a > 0 && b > 0){
            return ans;
        }
        else if (a < 0 && b < 0){
            return ans;
        }
        else {
            return -ans;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(divide(a, b));
    }
}
