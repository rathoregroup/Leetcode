public class ConstructTheRectangle {
    public static void main(String[] args) {
        int area = 122122;

        int width = (int)Math.sqrt(area);

        while (area % width > 0){
            --width;
        }
        
        System.out.println(area / width + ", " + width);
        // return new int[] {area / width, width};
    }
}
