import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
            int count = 1, sum = 0;
            Scanner input = new Scanner(System.in); // Setting up scanner object
            System.out.println("Enter your number ==> ");
            count = input.nextInt(); // Grabbing the input
            System.out.println("Count is " +count);
            while (count < 11) {

                sum = sum + count; //Overwriting sum
                System.out.println(count++);

            }
            System.out.println("sum = " + sum);

    }
}
