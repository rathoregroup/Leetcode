import java.util.Arrays;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t){
        int l1 = s.length();
        int l2 = t.length();

        if (l1 != l2){
            return false;
        }

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < l1; i++)
            if (c1[i] != c2[i])
                return false;
        
        return true;
    }
    public static void main(String[] args) {
        String s = "angaram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
