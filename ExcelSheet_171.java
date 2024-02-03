public class ExcelSheet_171 {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String columnTitle){
        int ans = 0;

        for (char ch : columnTitle.toCharArray()){
            ans = ans * 26 + ch - '@';
        }
        return ans;
    }
}
