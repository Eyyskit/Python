import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SubCipherTest {
    public static void main(String[] args){
        List<Character> characters = new ArrayList<Character>();
        for (int i='a'; i<='z'; i++)
            characters.add((char)i);
        Collections.shuffle(characters);

        //Below is the code for generating a substitution table named "SubTable"
        Map<Character, Character> SubTable = new HashMap<Character, Character>();
        int ListIndex = 0; //This is the position of each item in the table
        for (int i='a'; i<='z'; i++)
            SubTable.put((char)i, characters.get(ListIndex++));
        SubTable.put(' ', ' ');

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
        String plaintext = "hello emmanuel";
        String encrypted = encrypt(SubTable,plaintext);
        System.out.println("We encrypted "+ plaintext + " to "+ encrypted);

        //Decryption code below
        String decrypted = decrypt(SubTable, encrypted);
        System.out.println("We decrypted "+ encrypted + " to "+ decrypted.toUpperCase());

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
