public class LengthOfLastWorld_58 {
    public static int lengthOfLastWorld(String s){
        s = s.trim();
        int n = 0;
        int i = s.length() - 1;
        while(i >= 0){
            if (s.charAt(i) != ' '){
                n++;
            }
            else 
                break;
            i--;
        }
        return n;  
    }
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWorld(s));
    }
}
