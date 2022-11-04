import java.util.Scanner;

public class ss {

    public static void main(String[] args) {
        String[] season = {"Winter","Summer","Autumn","Spring"};
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month here: ");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                x = season[0];
                break;
            case 3:
            case 4:
            case 5:
                x = season[3];
                break;
            case 6:
            case 7:
            case 8:
                x = season[1];
                break;
            case 9:
            case 10:
            case 11:
                x = season[2];
                break;
            default:
                x = "invalid";
        }
        System.out.println("The month you entered is in the " + x + " Season.");
    }
}


