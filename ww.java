public class ww {
    public static void main(String[] args){
        int vowelCounter = 0;
        String name = "eugene";
        for (int i = 0; i < name.length(); i++) {
            char t = name.charAt(i);
            System.out.println("The Character is "+t);
            switch (t) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a vowel");
                    vowelCounter++;
                    break;
                default:
                    System.out.println("It is a consonant");

            }
        }
        System.out.println("The number of vowels in the name is "+vowelCounter);
    }

}
