import java.util.Arrays;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args){
        int[] intArray = { 18, 12 };
        System.out.println(Arrays.toString(intArray));

        int multi = intArray[0] * intArray[1];
        System.out.println("The answer is "+multi);
    }
}
