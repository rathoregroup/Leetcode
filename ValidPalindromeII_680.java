public class ValidPalindromeII_680 {
    public static void main(String[] args) {
        
    }

    public static boolean validPalindrome(String s){
        int count;
        int compare = 1;

        for (int i = 0; i < s.length(); i++){
            count = 1;
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' '){
                    count++;
                }
            }
            if (i == 0)
                compare = count;
            
            if ()
            
          
    }
}
