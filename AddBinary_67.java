public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
        System.out.println('1' - '0');
    }

    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry == 1){
            if (i >= 0){
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0){
                carry += b.charAt(j--) - '0';
            }
            System.out.println(carry);
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
