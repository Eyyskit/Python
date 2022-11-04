import java.util.List;
import java.util.stream.Collectors;

public class teeee {
}
    /*
    //The code below gets strings with the specified blood groups and prints them in a list
    List<String> matches = input.stream().filter(it -> it.contains(";O-")).collect(Collectors.toList());
        System.out.println(matches);

    List<String> matches1 = input.stream().filter(it -> it.contains(";O+")).collect(Collectors.toList());
        System.out.println(matches1);

    List<String> matches2 = input.stream().filter(it -> it.contains(";A-")).collect(Collectors.toList());
        System.out.println(matches2);

    List<String> matches3 = input.stream().filter(it -> it.contains(";A+")).collect(Collectors.toList());
        System.out.println(matches3);

    List<String> matches4 = input.stream().filter(it -> it.contains(";B-")).collect(Collectors.toList());
        System.out.println(matches4);

    List<String> matches5 = input.stream().filter(it -> it.contains(";B+")).collect(Collectors.toList());
        System.out.println(matches5);

    List<String> matches6 = input.stream().filter(it -> it.contains(";AB")).collect(Collectors.toList());
        System.out.println(matches6);

    List<String> matches7 = input.stream().filter(it -> it.contains("AB+")).collect(Collectors.toList());
        System.out.println(matches7);


    List<String> match = output.stream().filter(it -> it.contains(";O-")).collect(Collectors.toList());
        System.out.println(match);

    List<String> match1 = output.stream().filter(it -> it.contains(";O+")).collect(Collectors.toList());
        System.out.println(match1);

    List<String> match2 = output.stream().filter(it -> it.contains(";A-")).collect(Collectors.toList());
        System.out.println(match2);

    List<String> match3 = output.stream().filter(it -> it.contains(";A+")).collect(Collectors.toList());
        System.out.println(match3);

    List<String> match4 = output.stream().filter(it -> it.contains(";B-")).collect(Collectors.toList());
        System.out.println(match4);

    List<String> match5 = output.stream().filter(it -> it.contains(";B+")).collect(Collectors.toList());
        System.out.println(match5);

    List<String> match6 = output.stream().filter(it -> it.contains(";AB")).collect(Collectors.toList());
        System.out.println(match6);

    List<String> match7 = output.stream().filter(it -> it.contains("AB+")).collect(Collectors.toList());
        System.out.println(match7);


   input.add("Paul;O+");
        input.add("Emma;O+");
        input.add("Cindy;O+");
        input.add("Elyon;O+");
        input.add("Mark;O+");
        input.add("Devon;O+");
        input.add("Ernest;O+");
        input.add("Max;O+");
        input.add("John;A+");
        input.add("Alex;A+");
        input.add("Chris;A+");
        input.add("Lia;A+");
        input.add("Alios;A+");
        input.add("Fleurie;B+");
        input.add("Dominic;B+");
        input.add("Jeffrey;B+");
        input.add("Alice;B+");
        input.add("Mary;O-");
        input.add("Hank;O-");
        input.add("Jack;O-");
        input.add("Tucker;O-");
        input.add("Mwidu;A-");
        input.add("Okotel;A-");
        input.add("Cedric;B-");
        input.add("Wendy;AB+");
        input.add("Irene;AB-");
        input.add("Willy;O+");
         output.add("Ben;O+");
        output.add("Angiro;O+");
        output.add("Henry;O+");
        output.add("Jolie;O+");
        output.add("Bell;O+");
        output.add("Ali;O+");
        output.add("Thant;O+");
        output.add("Penn;O+");
        output.add("Madonna;O+");
        output.add("Elvis;O+");
        output.add("Jilette;O+");
        output.add("Presley;O+");
        output.add("Britney;O+");
        output.add("Paces;O+");
        output.add("Graham;O+");
        output.add("Don;O+");
        output.add("McCartney;O-");
        output.add("Homer;O+");
        output.add("Walt;A+");
        output.add("Nero;A+");
        output.add("Wodehouse;A+");
        output.add("Demi;A+");
        output.add("Moore;A+");
        output.add("Bill;A+");
        output.add("Julius;A+");
        output.add("Mariah;A+");
        output.add("Bob;A+");
        output.add("Dylan;A+");
        output.add("Fiona;B+");
        output.add("Jennifer;B+");
        output.add("Linda;B+");
        output.add("Richard;B+");
        output.add("Charles;B+");
        output.add("Daniel;B+");
        output.add("Andrew;B+");
        output.add("Brian;B+");
        output.add("Kevin;O-");
        output.add("Ryan;O-");
        output.add("Jacob;O-");
        output.add("Nicholas;O-");
        output.add("Amy;O-");
        output.add("Helen;O-");
        output.add("Mansur;O-");
        output.add("Pamela;O-");
        output.add("Samuel;A-");
        output.add("Brandon;A-");
        output.add("Eric;A-");
        output.add("Frank;A-");
        output.add("Immaculate;B-");
        output.add("Patrick;B-");
        output.add("Jerry;AB+");
        output.add("Tyler;AB+");
        output.add("Debra;AB-");
        output.add("Ruth;AB-");



        if(input.equals("O+")&&output.equals("O+"))

    {


    } else if(input.equals("O-"))

    {

    } else if(input.equals("A+")&&(output.equals("A+")||output.equals("AB+")))

    {

    } else if(input.equals("A-")&&(output.equals("A+")||output.equals("AB+")||(output.equals("A-")||(output.equals("AB-")))))

    {

    } else if(input.equals("B+")&&(output.equals("AB+")||output.equals("B+")))

    {

    } else if(input.equals("B-")&&(output.equals("AB+")||output.equals("AB-")||output.equals("B+")||(output.equals("B-"))))

    {

    } else if(input.equals("AB+")&&(output.equals("AB+")))

    {

    } else if(input.equals("AB-")&&(output.equals("AB+")||output.equals("AB-")))

    {

    }


//        List<String> listMat = new ArrayList<String>();
    ///       for (String string : output) {
    //        if(string.matches("(?i)().*")){
    //          listMat.add(string);
    //    }
    //}
    //System.out.println(listMat);
/*
        for ( int i = 0; i < donors.size(); i++)
        {
            for ( int j = 0; j < recipient.size();j++)
            {
                if (donors.get(i).contains("A-") && recipient.get(j).contains("O+"))
                {
                    System.out.println( donors.get(i) + " MATCHED WITH " + recipient.get(j));

                }
            }*/




/*
//List<String> temps = new ArrayList<String>();
//
//    // while loop
//    while (inFile1.hasNext()) {
//      // find next line
//      token1 = inFile1.next();
//      temps.add(token1);
//    }
//    inFile1.close();
//
//    String[] tempsArray = temps.toArray(new String[0]);
//
//    for (String s : tempsArray) {
//      System.out.println(s);
//    }
//  }  */


//System.out.println(data);

//            Set<String> set = new HashSet<String>(donorsArr);
//            BufferedReader br = new BufferedReader(my); //Creation of BufferedReader object
//            String s;
//            String input="Java";   // Input word to be searched
//            int count=0;   //Intialize the word to zero
//            while((s=br.readLine())!=null)
//                if (set.contains("O-,O+,A-,A+,B-,B+,AB-,AB+"))
//            {
//                for (int y = 0; y < donorsArr.size(); y++) {
//
//                }
//                System.out.println(set);
//            }

//            String[] name = data.split("O-");
//            System.out.println(name.toString());


//        for (int y = 0; y < donorsArr.size(); y++){
//            String name = donorsArr.split("O-");
//
//        for (int i = 0; i < donorsArr.size(); i++) {
//            String str = donorsArr.get(i);
//            String[] details = str.split("O-");
//            donors.add(details.stream().filter(it -> it.contains("AB+")).collect(Collectors.toList()););
//            Collectors.toList();
//            System.out.println(details);
 /*for (int i = 0; i < output.size(); i++) {
            String str = output.get(i);
            String[] details = str.split(";");
            recipient.add(details);
            String str = input.get(1);
                    String[] details = str.split(";");
                    System.out.println(details);



Ben;O+
Angiro;O+
Henry;O+
Jolie;O+
Bell;O+
Ali;O+
Thant;O+
Penn;O+
Madonna;O+
Elvis;O+
Jilette;O+
Presley;O+
Britney;O+
Paces;O+
Graham;O+
Don;O+
McCartney;O-
Homer;O+
Walt;A+
Nero;A+
Wodehouse;A+
Demi;A+
Moore;A+
Bill;A+
Julius;A+
Mariah;A+
Bob;A+
Dylan;A+
Fiona;B+
Jennifer;B+
Linda;B+
Richard;B+
Charles;B+
Daniel;B+
Andrew;B+
Brian;B+
Kevin;O-
Ryan;O-
Jacob;O-
Nicholas;O-
Amy;O-
Helen;O-
Mansur;O-
Pamela;O-
Samuel;A-
Brandon;A-
Eric;A-
Frank;A-
Immaculate;B-
Patrick;B-
Jerry;AB+
Tyler;AB+
Debra;AB-
Ruth;AB-




Paul;O+
Emma;O+
Cindy;O+
Elyon;O+
Mark;O+
Devon;O+
Ernest;O+
Max;O+
John;A+
Alex;A+
Chris;A+
Lia;A+
Alios;A+
Fleurie;B+
Dominic;B+
Jeffrey;B+
Alice;B+
Mary;O-
Hank;O-
Jack;O-
Tucker;O-
Mwidu;A-
Okotel;A-
Cedric;B-
Wendy;AB+
Irene;AB-
Willy;O+
*/