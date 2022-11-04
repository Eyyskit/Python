import java.io.*;
import java.util.ArrayList;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter fileOut;
        String names[] = {"Jeffrey", "Emmanuel", "George", "Phillip"};

        File file = new File("uw.txt"); //initialize File object and passing path as argument
        boolean result;

        result = file.createNewFile(); //creates a new file
        FileWriter FileWrite = new FileWriter("filename.txt");
        int lent = names.length;
        for (int i = 0; i < lent; i++) {
            FileWrite.write(names[i] + ",");
        }
        System.out.println(names);
        FileWrite.close();

    }
}
        /*
        try
        {
            fileOut = new PrintWriter(new FileWriter("filename.txt"));
            fileOut.println(text);
            fileOut.println("How are you");
            fileOut.close();
        }//end try
        catch(Exception e)
        {
         System.out.println("Error:"+e.getMessage());
        }
    }
}
*/