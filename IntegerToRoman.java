public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3549;
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int i = 12;
        String [] s = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D","CM", "M"};
        
        StringBuilder str = new StringBuilder();
        while (num!=0){
            int div = num/arr[i];
            num  %= arr[i];

            while (div!=0){
                str.append(s[i]);
                div--;
            }
            i -= 1;
        }
        System.out.println(str);
    }
}

/*
 *	xprivate static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

public static final String integerToRoman2(int number) {

	StringBuilder s = new StringBuilder();

	for (int i = 0; i < values.length; i++) {
		while (number >= values[i]) {
			number -= values[i];
			s.append(romanLiterals[i]);
		}
	}
	return s.toString();
}
 */

 /*
  * public static String integerToRoman1(int number) {
	StringBuilder s = new StringBuilder();
	while (number >= 1000) {
		s.append("M");
		number -= 1000;
	}
	while (number >= 900) {
		s.append("CM");
		number -= 900;
	}
	while (number >= 500) {
		s.append("D");
		number -= 500;
	}
	while (number >= 400) {
		s.append("CD");
		number -= 400;
	}
	while (number >= 100) {
		s.append("C");
		number -= 100;
	}
	while (number >= 90) {
		s.append("XC");
		number -= 90;
	}
	while (number >= 50) {
		s.append("L");
		number -= 50;
	}
	while (number >= 40) {
		s.append("XL");
		number -= 40;
	}
	while (number >= 10) {
		s.append("X");
		number -= 10;
	}
	while (number >= 9) {
		s.append("IX");
		number -= 9;
	}
	while (number >= 5) {
		s.append("V");
		number -= 5;
	}
	while (number >= 4) {
		s.append("IV");
		number -= 4;
	}
	while (number >= 1) {
		s.append("I");
		number -= 1;
	}
	return s.toString();
}
  */
