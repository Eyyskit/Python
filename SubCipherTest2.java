import java.util.*;
import java.util.stream.Collectors;

public class SubCipherTest2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String encrypted = "";

        List<Character> characters = new ArrayList<Character>();
        for (int i='a'; i<='z'; i++)
            characters.add((char)i);
        Collections.shuffle(characters);

        //Below is the code for generating a substitution table named "Sub"
        Map<Character, Character> SubTable = new HashMap<Character, Character>();
        int ListIndex = 0; //This is the position of each item in the table
        for (int i='a'; i<='z'; i++)
            SubTable.put((char)i, characters.get(ListIndex++)); //This
        SubTable.put(' ', ' '); //fgh
        int a = 0; //initializing the variable before the while loop can work

        //Below is the validation rule for data entry concerning the game mode
        while(a!=1 && a!=2) {
            System.out.println("Enter a number representing the game mode: (1) for Normal mode and (2) for Test mode");
            a = sc.nextInt();
            //Below is the validation for the number entered to represent the game mode
            if(a == 1){
                System.out.println("You have chosen the Normal mode: ");
                String plaintext = "hello emmanuel hoping you are well ";
                encrypted = encrypt(SubTable,plaintext.toLowerCase());
            }
            else if(a ==2){
                System.out.println("You have chosen the Test mode: ");



            }
        }


        //We then display the substitution table with the following code
        System.out.println("The substitution table: ");
        /*
        The code below will perform the given action for each element of the Iterable until all elements have been processed
        or the action throws an exception.
        Actions are performed in the order of iteration, if that order is specified.
        Exceptions thrown by the action are relayed to the caller.
         */
        SubTable.entrySet().forEach(entry->{
            System.out.print(entry.getKey() + ":" + entry.getValue() + " : ");
        });
        System.out.println(); //This is just to print a blank line.

        //The encryption and decryption processes begin here!!
        //This is just as simple as running a lookup in the substitution table
        /*
        String plaintext = "hello emmanuel hoping you are well \nWe intend to do a review of the portfolio concerning the project we worked on last year";
        String encrypted = encrypt(SubTable,plaintext.toLowerCase());
        System.out.println("Plain text: "+ plaintext + " \nCipher text: "+ encrypted);
        */

        //Decryption code below
        String decrypted = decrypt(SubTable, encrypted);
        System.out.println();
        System.out.println();
        System.out.println("Below is the reverse process:");
        System.out.println("We decrypted: \n"+ encrypted + " \nto obtain: \n"+ decrypted.toUpperCase());

    }

    //Below are the subclasses to run the algorithms for encryption and decryption named above as 'encrypt' and 'decrypt'

    public static String encrypt(Map<Character, Character> SubTable, String plaintext){
        StringBuilder strbd = new StringBuilder();
            for(char character : plaintext.toCharArray())
                strbd.append(SubTable.get(character));
            String encrypted = strbd.toString();
            return encrypted;
    }

    public static String decrypt(Map<Character, Character> SubTable, String encrypted){
        Map<Character, Character> SubTableInversed = SubTable.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        StringBuilder strbd2 = new StringBuilder();
        for(char character : encrypted.toCharArray())
            strbd2.append(SubTableInversed.get(character));
        String decrypted = strbd2.toString();
        return decrypted;
    }
}
