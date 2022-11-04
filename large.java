import javax.swing.*;

public class large {
    public static void main(String[] args) {

        int sum = 0, biggest = 0, smallest = 0;
        for (
                int i = 0;
                i < 3; i++) { // Block of code
            String x = JOptionPane.showInputDialog("Enter the number in position " + (i + 1));
            Integer num = Integer.parseInt(x); // Parsing of the String x into an Integer
            sum = sum + num;
            if (i == 0) // Setting the first number as being the reference point
            {
                biggest = num;
                smallest = num;
            }

            if (num <= smallest) {
                smallest = num;
            }

            if (num >= biggest) {
                biggest = num;
            }
        }
        // Code needs to be refined
        System.out.println("The total is " + sum);
        System.out.println("The average is " + (sum / 3)); // Use doubles for average
        System.out.println(biggest);

    }
}
