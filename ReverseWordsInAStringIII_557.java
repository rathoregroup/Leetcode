import java.util.*;

public class ReverseWordsInAStringIII_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        s.trim();
        String str = "";
        int n = s.trim().length();
        int j = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == ' ' || i == n-1){
                int k = i;
                str = str + reverseString(s.substring(j, k+1));
                j = i+1;
            }
            if (s.charAt(i) == ' '){
                str = str + " ";
            }
            
        }
        return str;
        
    }
    public static String reverseString(String s){
        String str = "";
        //Reverse String;
        for (int i = s.trim().length() - 1; i >= 0; i--){
            str += s.trim().charAt(i);
            
        }
        return str;
    }
}
