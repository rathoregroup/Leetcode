public class KeyboardRow_500 {
    public static void main(String[] args) {
        String[] str = {"Hello","Alaska","Dad","Peace"};
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        boolean flag = false;

        for (int i = 0; i < str.length; i++){
            for (int k = 0; k < str[i].length(); k++){
                for (int j = 0; j < row1.length(); j++){
                    if (str[i].charAt(k) == row1.charAt(j)){
                        flag = true;
                    }
                    else 
                }
            }
        }
    }
}
