import javax.swing.border.MatteBorder;
import java.util.*;

public class LotteryGame {
    public static void main(String[] args) {
        //To generate 10 random numbers
        int sums = 0;
        Random run = new Random();
        for (int i = 0; i < 10; i++) {  // This is the loop that allows only 10 numbers to be output
            int adds = run.nextInt(99 + 1);
            System.out.print(String.format("%02d", adds) + " "); // In the print loop the string format lets me print the single digit numbers with a zero and the " " is for the space between the numbers

            sums += adds;//This is to generate the sum of the 10 numbers printed


        }
        System.out.print("\n");
        System.out.println("The total randomized sum of all the 10 numbers is " + sums);


        //Bonus Game
        List<String> arrs = new ArrayList<>();
        arrs.add("£10(15% chance)");
        arrs.add("£20(27% chance)");
        arrs.add("£50(15% chance)");
        arrs.add("£200(6% chance)");
        arrs.add("£1000(2% chance)");

        LotteryGame gen = new LotteryGame();

        // this takes items according to the size specified and then randomly prints the elements
        System.out.println("\n");
        System.out.print("The sums choosen are;");
        System.out.println(gen.pickedSums(arrs, 4));// this is to let the computer print only 4 choosen sums out of the five
        if(much(arrs)) {
            System.out.println("The sum you won is "+arrs);// this the print line that prints the sums that appear more than once
        }




        //declaring arrays and letting the user input the values
        Scanner Nums = new Scanner(System.in);
        System.out.println("Please enter your five numbers below");
        int[] a = new int[5];
        for (int c = 0; c < 5; c++) { // this is a loop that llows 5 numbers to be input

            a[c] = Nums.nextInt();


        }
        System.out.println(Arrays.toString(a));

        //Method to remove a repeated input
        if(a == a){
            System.out.println(a);
        }



        //The user is asked to guess the sum of all 10 numbers
        Scanner scan = new Scanner(System.in);
        int guesses = 0;
        for (int k = 0; k < 1; k++) {
            System.out.println("Enter your guess for the total sum of the ten numbers below");
            guesses = scan.nextInt();

            if (sums == guesses) {
                System.out.println("You guessed the sum correctly");
                System.out.println("Since you guessed the sum correctly, you have won yourself £300,000");//For the user that guessed the sum correctly
                break;
            } else {
                System.out.println("The sum you guessed is wrong");
            }
        }


        //To check if the numbers picked by the user is as the same as the random number
        //not attempted 4 and 6






    }














    // This function allows to select an element base on index and return it returns the element

    public List<String>pickedSums(List<String> sum, int totalSum) {
        Random picks = new Random();

        // A temporary list is created for the selected elements
        List<String> newSums = new ArrayList<>();
        for (int i = 0; i < totalSum; i++) {

            // take a random index between 0 to size of the list you have been given
            int randIndex = picks.nextInt(sum.size());

            // add element in temporary list
            newSums.add(sum.get(randIndex));
        }
        return newSums;

    }

    //Method for the sums that appear more than once
    public static boolean much(List<String> arr) {
        boolean tru = false;
        int counter = 0;
            if (counter > 1){
                tru = true;
            }
            return tru;
    }






}


