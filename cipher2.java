import java.util.Random;
import java.util.Scanner;

public class cipher2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); //instantiating the random class
        int UB = 25; //generate values from 0 to 25
        int LB = 1;
        System.out.println("Random Shift Factor");
        double x = Math.random()*(UB -LB+1)+LB;

        System.out.println("Enter the plain text:");
        String PT = sc.nextLine(); //prints the text on the next line
        PT = PT.toLowerCase(); //transforms text to lower case
        System.out.println(PT);

        System.out.println("Cipher Text:");
        char a[] = PT.toCharArray(); //splits each letter in an array
        for(int i = 0; i<a.length; i++){  //tells i to randomize the array and should be less than the character number
            a[i] = (char)(x+(int)a[i]); //
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
