public class stone {
    public static void main(String[] args){
        String word = "stone";
        char x = word.charAt(0); //Returns the first character of String word
        System.out.println(x);

        int seconds = 0;
        int minutes = 0;

        for (minutes = 10; minutes < 60; minutes = minutes+2) {
            for (seconds = 50; seconds < 60; seconds++) {
                if (seconds % 2 == 0) {
                    System.out.println(minutes + " : " + seconds);
                }
            }
        }
    }
}
