import javax.swing.*;

public class prac {
    public static void main(String[] args){
        String month = JOptionPane.showInputDialog("Enter Month number ");
        int monthNum = Integer.parseInt(month);
        if((monthNum == 1) | (monthNum == 3) | (monthNum == 5) ) // extend to include months 7, 8, 10 and 12
        {
            System.out.println("The month has 31 days");
        }

        int num = 18;
        if (num % 3 == 0)
        {
            System.out.println("It is divisible by 3");
        }
    }
}
