public class Switch {
    public static void main(String[] args){
        int count = 3;
   /*     if (count == 4) {
            System.out.println("Too few");
        } else if (count == 3) {
            System.out.println("Too much");
        } else {
            System.out.println("Enough");
        }*/
        //  System.out.println("bye");

        switch (count) {
            case 3:
                System.out.println("It is 3");
                break;
            case 4:
                System.out.println("It is 4");
                break;
            default:
                System.out.println("It is neither");
                break;
        }
    }
}
