import java.util.*;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose between the two modes normal mode(1) and test mode(2) by typing in the number representing the mode:");
        int a = sc.nextInt();
        if(a == 1) {
            System.out.println("You have chosen the normal mode");
        }
        else if(a == 2){
            System.out.println("You have chosen the test mode");
        }
        else{
            System.out.println("Type the correct number");
        }

        String Mo = ("What is your name");
        System.out.println("Length of the string is "+Mo.length());
        while(Mo.length()>50){
            System.out.println("\n");
        }
        Random rand = new Random(); //instantiating the random class
        int UB = 25; //generate values from 0 to 25
        int LB = 1;
        System.out.println("Random Shift Factor");
        int x = (int)(Math.random()*(UB-LB+1)+LB);

        System.out.println("Enter the plain text:");
        Mo = Mo.toLowerCase(); //transforms text to lower case
        System.out.println(Mo);

        System.out.println("Cipher Text:");
        char p[] = Mo.toCharArray(); //splits each letter in an array
        for(int i = 0; i<p.length; i++){  //tells i to randomize the array and should be less than the character number
            p[i] = (char)(x+(int)p[i]); //
        }
        for(int i = 0; i<p.length; i++){
            System.out.print(p[i]);
        }


    }
}
