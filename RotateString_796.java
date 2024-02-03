public class RotateString_796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "abced";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal){
        if (s.length() != goal.length()){
            return false;
        }
        else {
            s = s.concat(s);
            if (s.indexOf(goal) != -1){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
