public class StudentAttendence_551 {
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s){
        int countAbs = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                countAbs++;
            }
        }
        
        if (countAbs >= 2){
            return false;
        }

        for (int i = 0; i <= s.length()-3; i++){
            String a = s.substring(i, i+3);
            if (a.equals("LLL")){
                return false;
            }
        }

        return true;
    }
}
