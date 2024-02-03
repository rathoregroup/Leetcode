import java.util.Arrays;

public class ZigZagCoversion_6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        convert(s, 0);
    }

    static String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1){
            return s;
        }
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");

        char[] ch = s.toCharArray();

        int rows = 0;
        boolean down = true;

        for (int i = 0; i < n; i++){
            arr[rows] += ch[i];
            if (rows == numRows - 1) {
                down = false;
            }
            if (rows == 0){
                down = true;
            }

            if (down){
                rows++;
            }
            else {
                rows--;
            }
        }
        String str = "";
        for (int i = 0; i < numRows; i++){
            str += arr[i];
        }
        return str;
    }
}
