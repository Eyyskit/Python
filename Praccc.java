import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//class Num {
//    public int findNum(int[] myarray) {
//        int maxNum = 0;
//        //traverse the array to compare each element with max_val
//        for (int i = 0; i < myarray.length; i++) {
//            if (myarray[i] > maxNum && myarray[i] < minNum) {
//                maxNum = myarray[i];
//            }
//
//        }
//        //return max_val
//        return maxNum;
//    }
//
//}
//
//
//class Main {
//    private static Num maxClassobj;
//
//    public static void main(String args[]) {
//        //input array
//        int[] A = {43, 54, 23, 65, 78, 85, 88, 92, 10};
//        System.out.println("Input Array:" + Arrays.toString(A));
//
//        //create object of class which has method to find maximum
//        maxClassobj = new Num();
//        //pass input array to find_max method that returns maximum element
//        System.out.println("Maximum value in the given array is::" + maxClassobj.findNum(A));
//    }
//}
//public class Praccc {
//    public static void main(String[] args) {
//        try {
//            File myObj = new File("filename.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try {
//            File myObj2 = new File("donors.txt");
//            Scanner myReader = new Scanner(myObj2);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//}
// class product {
//    private static String name;
//    private static double price;
//
//    public product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String toString() {
//        return "name =" + name + "\nprice = " + price;
//    }
//
//    public static void main(String[] args) {
//        name = "Jane";
//        price = 4.5;
//    }
//}
//
//class num{
//    public int findNum(int [] array) {
//        int maxNum = 0;
//
//        for(int i=0; i<array.length; i++ ) {
//            if(array[i]>maxNum) {
//                maxNum = array[i];
//            }
//        }
//        return maxNum;
//    }
//}
//
//
//public class Main {
//    public static void main() {
//        main();
//    }
//
//    public static void main(String[] args) {
//        int[] A = {1, 5, 5, 4, 7, 8, 6, 1, 6, 7, 8, 6, 7, 1, 6};
//        maxClassobj = new Num();
//        System.out.println("The maximum is"+ maxClassobj.findNum(A));
//
//    }
//
//}
