import java.io.*;
import java.util.*;


public class Blood
{
    public static void main(String[] args)
    {
        ArrayList<String> list_donors = new ArrayList<String>();
        ArrayList<String> list_recp = new ArrayList<String>();

        System.out.println("Starting!");
        copyFromFile("donors.txt", list_donors);
        System.out.println("imported "+ list_donors.size() + " registers");

        copyFromFile("receipents.txt", list_recp);
        System.out.println("imported "+ list_recp.size() + " registers");
        System.out.println("Finished!");
    }

    public static void copyFromFile(String filename, ArrayList<String> listDestiny)
    {
        Scanner fileScanner;
        FileReader fileReader;
        try
        {
            fileReader = new FileReader(filename);
            fileScanner = new Scanner(fileReader);

            while (fileScanner.hasNextLine())
            {
                String currentLine = fileScanner.nextLine();
                String type = currentLine.substring((currentLine.indexOf(";") + 1));
                if(isValidBloodType(type))
                {
                    listDestiny.add(currentLine);
                    System.out.println("Imported: " + currentLine);
                }else{
                    System.out.println("Invalid blood type!! Alien detected with blood type: " + type);
                }
            }

            fileScanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Arquivo não encontrado");
        }
    }

    public static Boolean isValidBloodType(String type)
    {
        String[] blood_type = {"o-", "o+", "a-", "a+", "b-", "b+", "ab-", "ab+"};
        return Arrays.asList(blood_type).contains(type);
    }

}
