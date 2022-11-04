import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class joeisanidiot {
    public static void main(String[] args) throws IOException {

        String token1 = "";

        Scanner in = new Scanner(System.in);
        Scanner fileIn;

        System.out.print("Enter file name: ");
        String askFile = in.nextLine();

        List<String> temps = new ArrayList<String>();
        fileIn = new Scanner(new FileReader(askFile));
        while (fileIn.hasNextLine()) {
            token1 = fileIn.nextLine();
            temps.add(token1);
        }
        fileIn.close();
        String[] tempsArray = temps.toArray(new String[0]);


        for (int i = 0; i < tempsArray.length; i++) {
            System.out.println(tempsArray[i].toUpperCase());
        }
        String name = "Emma";

        String[] newarr = tempsArray.clone();
        for (String s : newarr) {
            System.out.println(s);
        }




    }
}
