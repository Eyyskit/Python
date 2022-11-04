import java.util.Scanner;

public class MyFirstJavaClass {
    public static void main(String[] args){
        System.out.println("Hey iam Okotel Emmanuel");
        System.out.println("I will uphold the constitution");
        int MyAge = 0;
        Scanner MyRealAge = new Scanner(System.in);
        MyAge = MyRealAge.nextInt();
        System.out.println("You are"+MyAge+"years old!");
    }
}
