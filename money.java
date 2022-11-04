public class money {
    public static void main(String[] args) {
        int totalChange = 11656;
        int tenEuros = totalChange / 1000;
        System.out.println("You have " + tenEuros + " 10 Euros Notes");
        totalChange = totalChange % 1000;
        int fiveEuros = totalChange / 500;
        if (fiveEuros > 0) {
            System.out.println("You have " + fiveEuros + " 5 Euros Notes");
        }
    }
}

//They want us to find how many 1000 euros from 11656 and hwo many 500 euros do you get from 11656