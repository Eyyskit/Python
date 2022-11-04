import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        int sum = 0;
        for(int count = 0; count<101; count++){
            sum = sum+count;
        }
        System.out.println("The sum of the first 100 numbers is "+sum);

    }
}
