import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner fileIn;

        //    System.out.println("Please enter file name:");
//    String filename = in.nextLine();
        double total = 0;

        try {
            fileIn = new Scanner(new FileReader("greeting.txt"));
            fileIn.useDelimiter(";");

            while (fileIn.hasNext()) {
                double num = fileIn.nextDouble();

                System.out.println(num);
                total = total + num;
            }

            fileIn.close();


            System.out.println("Total: " + total);
        }//end try
        catch (
                FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }//end catch
        catch (
                InputMismatchException e) {
            System.out.println("One of the numbers was not a valid number");
        }//end catch
    }
}
