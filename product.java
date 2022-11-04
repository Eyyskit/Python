import java.util.Scanner;
public class product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//Used to input data
        System.out.println("Enter your first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter your second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter your third number:");
        int num3 = sc.nextInt();

        int sum = num1 + num2 +num3;
        System.out.println("The sum of these three numbers is "+sum);

        int product = num1 * num2 * num3;
        System.out.println("The product of these three numbers is "+product);

        /*System.out.println("The min is "+Math.min(num1, num2));This method only works with 2 numbers*/

        int average = sum/3;
        System.out.println("The average of these three numbers is "+average);
//Code for outputting maximum and minimum
        if(num1>num2 && num1>num3){
            System.out.println("The maximum value is "+num1);
        }   else if(num2>num1 && num2>num3){
            System.out.println("The maximum value is "+num2);
        }   else{
            System.out.println("The maximum value is "+num3);
        }
        if(num1<num2 && num1<num3){
            System.out.println("The minimum value is "+num1);
        }   else if(num2<num1 && num2<num3){
            System.out.println("The minimum value is "+num2);
        }   else{
            System.out.println("The minimum value is "+num3);
        }
    }
}
