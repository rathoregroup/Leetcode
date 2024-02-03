public class FindTheIndexOfTheFirstOccurrenceInString_28 {
    public static int strStr(String haystack, String needle){
        int l = needle.length();
        int n = haystack.length();
        int i = 0;
        while (l+i <= n){

            if (haystack.substring(i, l+i).equals(needle)){
                return i;
            }
            i++;
        }
        return -1;
        
    }

    public static void main(String[] args) {
        String h = "sadbutsad";
        String n = "but";
        System.out.println(strStr(h, n));
    }
}
