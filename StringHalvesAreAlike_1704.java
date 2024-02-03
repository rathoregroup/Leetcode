public class StringHalvesAreAlike_1704 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        // int countS1 = 0;
        // int countS2 = 0;
        // s = s.toLowerCase();
        // for (int i = 0; i < s.length() / 2; i++){
        //     if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
        //         countS1++;
        //     }
        // }

        // for (int i = s.length() / 2; i < s.length(); i++){
        //     if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
        //         countS2++;
        //     }
        // }

        // if (countS1 == countS2){
        //     return true;
        // }
        // else {
        //     return false;
        // }
        char[] arr = s.toCharArray();
        int count1 = 0;
        int count2 = 0; 
        for (int i = 0; i < arr.length / 2; i++){
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) count1++;
            if ("aeiouAEIOU".indexOf(arr[(arr.length / 2) + i]) != -1) count2++;
        }
        return count1 == count2;
    }
}
