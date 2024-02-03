public class RomanTOInteger_13 {
    public static int romanToInt(String s){
        int ans = 0;
        int [] r = new int[128];
        r['I'] = 1;
        r['V'] = 5;
        r['X'] = 10;
        r['L'] = 50;
        r['C'] = 100;
        r['D'] = 500;
        r['M'] = 1000;

        for (int i = 0; i+1 < s.length(); i++){
            if (r[s.charAt(i)] < r[s.charAt(i+1)]){
                ans -= r[s.charAt(i)];
            }
            else 
                ans += r[s.charAt(i)];
        }

        return ans + r[s.charAt(s.length() - 1)];
    }
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
