import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Shopping {

    private static ArrayList<Item> items;
    private static ArrayList<String> categories;
    static Scanner sc = new Scanner(System.in);


    private static void readFile() throws FileNotFoundException {
        File file = new File("stock.csv"); //creating a new file called stocks.csv

        if (!file.exists()) // checking if file exists
        {
            System.out.println("File does not exists");
            return;
        }

        Scanner filesc = new Scanner(file);
        String line;

        while (filesc.hasNext()) //writing to the file
        {
            line = filesc.nextLine();

            if (line.length() == 0)
                break;

            String splits[] = line.split(",");

            //0 id, 1 name, 2 description, 3 category, 4 quantity,5 price
            int quantity = Integer.parseInt(splits[4]);
            double price = Double.parseDouble(splits[5]);


            // makes new item and add in list
            items.add(new Item(splits[0], splits[1], splits[2], splits[3], quantity, price));

            // add category if not already included
            if (!categories.contains(splits[3]))
                categories.add(splits[3]);
        }

        filesc.close(); //closing the file
    }


    private static void printItems() //method to print items
    {


        for (int i = 1; i <= items.size(); i++) {
            System.out.println(i + " " + items.get(i - 1).toString());
            System.out.println("");
        }
    }


    private static void restock(String s) //method for restocking
    {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(s)) {
                System.out.println("Enter number of new Items: ");
                int n = sc.nextInt();
                sc.nextLine();

                n += items.get(i).getQuantity();
                items.get(i).setQuantity(n);
                return;
            }
        }

        System.out.println("Item not found"); // prints if item is not found
    }


    private static void outOfStock() //method for out of stock items
    {
        int j = 1;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getQuantity() == 0) {
                System.out.println(j + " " + items.get(i).toString());
                System.out.println("");
                j++;
            }
        }

        sc.nextLine();
    }


    private static void addItem() //  method to add an item
    {
        String id;
        boolean uniqueId = true;

        do {
            System.out.print("Enter id: ");
            id = sc.nextLine();

            for (Item i : items) {
                if (i.getId().equals(id)) {
                    uniqueId = false;
                    break;
                }
            }

        } while (!uniqueId);


        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Description: ");
        String description = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        double price = 500;

        do {
            System.out.print("Price: ");
            price = sc.nextDouble();
            sc.nextLine();

        } while (price > 1000);


        Item i = new Item(id, name, description, category, 0, price);
        items.add(i);

        System.out.println("Item was added into list");
    }

    private static void save() throws FileNotFoundException // method to save the file once all the operations are completed
    {
        PrintWriter writer = new PrintWriter("stock.csv");

        for (Item i : items) {
            //0 id, 1 name, 2 description, 3 category, 4 quantity,5 price
            writer.write(i.getId() + "," + i.getName() + "," + i.getDescription() + "," + i.getCategory() + ","
                    + i.getQuantity() + "," + i.getPrice() + "\n");
        }

        System.out.println("Saved to file successfully");
    }


    public static void main(String args[]) throws FileNotFoundException //main method that runs the program
    {
        items = new ArrayList<>();
        categories = new ArrayList<>();


        int choice1;
        do {
            System.out.println("1.Inventory Management");
            choice1 = sc.nextInt();
            sc.nextLine();
        }
        while (choice1 != 1);


        if (choice1 == 1) {
            while (true) // creating menu for the user
            {
                System.out.print("\n1.Restock   2.Out of stock  3.Add new Item  4.Save and Exit:  ");

                int choice2 = sc.nextInt();
                sc.nextLine();


                if (choice2 == 1) {
                    printItems();
                    System.out.println("Enter item id: ");
                    String id = sc.nextLine();

                    restock(id);
                } else if (choice2 == 2) {
                    outOfStock();
                } else if (choice2 == 3) {
                    addItem();
                } else if (choice2 == 4) {
                    save();
                    System.exit(0);
                } else {
                    System.out.println("Wrong choice, try again");
                }
                readFile();
            }
        }
    }
}