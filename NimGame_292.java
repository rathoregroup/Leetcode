public class NimGame_292 {
    public static boolean canWinNim(int n){
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(canWinNim(n));
    }
}
