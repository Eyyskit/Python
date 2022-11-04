import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class bloodDoners {
    public static void main(String[] args) throws IOException {
        //The throw exception helps check is there any errors and if so it will show the error message and exit the code


        File inputs = new File("donors.txt"); //initialize File object and passing path as argument


        String donors1 = "";
        Scanner firstFile = new Scanner(new File("donors.txt"));

        List<String> donorsArr = new ArrayList<String>();

        if (inputs.exists()) {                 // This is a loop to print what is in the file and if there's nothing in the file it will exit the code
            while (firstFile.hasNextLine()) {
                donors1 = firstFile.nextLine();
                donorsArr.add(donors1);
            }
            firstFile.close();
        } else {
            System.exit(0);
        }
        String[] donorArray = donorsArr.toArray(new String[0]);

        for (int m = 0; m < donorArray.length; m++) {    // This is a loop to split what is in the text file
            String pair1 = Arrays.toString(donorArray[m].split(";"));
            System.out.println(pair1);
        }



        String[] bTypes = {"O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+"};
        ArrayList<String> bloodTypes = new ArrayList<String>(Arrays.asList(bTypes));


        boolean[][] compat = {{true, false, false, false, false, false, false, false},
                {true, true, false, false, false, false, false, false},
                {true, false, true, false, false, false, false, false},
                {true, true, true, true, false, false, false, false},
                {true, false, false, false, true, false, false, false},
                {true, true, false, false, true, true, false, false},
                {true, false, true, false, true, false, true, false},
                {true, true, true, true, true, true, true, true}};





        String donort = "O-";
        String recip = "AB+";

        if (compat[bloodTypes.indexOf(recip)][bloodTypes.indexOf(donort)]) {
            System.out.println("Compatible");
        } else {
            System.out.println("Not compatible");
        }


        File outputs = new File("donors.txt"); //initialize File object and passing path as argument

        String receipents1 = "";
        Scanner secondFile = new Scanner(new File("receipents.txt"));

        List<String> receipentsArr = new ArrayList<String>();

        if (outputs.exists()) {
            while (secondFile.hasNextLine()) {
                receipents1 = secondFile.nextLine();
                receipentsArr.add(receipents1);
            }
            secondFile.close();
        } else {
            System.exit(0);
        }
        String[] receipentsArray = receipentsArr.toArray(new String[0]);

        for (int m = 0; m < receipentsArray.length; m++) {
            String pair2 = Arrays.toString(receipentsArray[m].split(";"));
            System.out.println(pair2);
        }


        File file = new File("appointments.txt"); //initialize File object and passing path as argument
        boolean result;
        try
        {
            result = file.createNewFile();  //creates a new file
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }
    }
}







