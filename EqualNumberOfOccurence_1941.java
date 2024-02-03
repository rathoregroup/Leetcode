public class EqualNumberOfOccurence_1941 {
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurenceEqual(s));

    }

    public static boolean areOccurenceEqual(String s){
        int count;
        int compare = 0;
        
        for (int i = 0; i < s.length(); i++){
            count = 1;
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' '){
                    count++;
                }
            }
            if (i == 0)
                compare = count;
            
            if (s.charAt(i) != ' ' && count != compare){
                return false;
            }
            
            s = s.replace(s.charAt(i), ' '); 
        }

        return true;
    }
}
