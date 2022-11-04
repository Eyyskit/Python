import java.util.Arrays;
import java.util.Scanner;

public class rrrrr {
    public static void main(String[] args) {
        int[] arr = new int[4]; // An array of ints with 4 blank spaces
        arr[0] = 43;
        arr[1] = 56;
        arr[2] = 67;
        arr[3] = 23;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
             System.out.println(arr[i]);
        }
        String classStudentNames[];

        Scanner x = new Scanner(System.in);
        System.out.println("Input the size of your array==> ");
        int sizeArr = x.nextInt();

        classStudentNames = new String[sizeArr];
        System.out.println(classStudentNames.length);
        System.out.println(Arrays.toString(classStudentNames));

    }
}
