public class out {
    public static void main(String[] args){
        String word ="Dog";
        int count = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(letter + "=" + word);
                count = 0;
            }
        }
    }
}
