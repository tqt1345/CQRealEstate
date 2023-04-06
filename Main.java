
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Object array lists
    ArrayList<Land> landList = new ArrayList<Land>();
    ArrayList<HouseAndLand> houseAndLandList = new ArrayList<HouseAndLand>();


    // Add a new Land object to the array
    public void addLand() {
        // Get land attributes
        int lotNumber = requestLotNumber();
        String address = requestAddress();
        double landArea = requestLandArea();

        // Create new land object and add it to the array
        Land land = new Land(lotNumber, address, landArea);
        landList.add(land);

        // Display inputted details for the newly created land object
        System.out.println("You have created a new entry with the following details:");
        System.out.println(land);
    }


    // requestLotNumber asks for and validates a lotNumber
    public int requestLotNumber() {
        Scanner input = new Scanner(System.in);
        int lotNumber = 0;
        boolean isValid = false; // Flag to break loop

        // Continues to request input until valid
        while (!isValid) {
            System.out.println("Enter the lot number: ");
            if (input.hasNextInt()) { // Checks if input is an integer
                lotNumber = input.nextInt();
                if (lotNumber > 0) { // Checks if input is greater than 0
                    isValid = true; // Breaks the loop if all conditions are met
                } else {
                    System.out.println("lot number must be greater than 0");
                }
            } else {
                System.out.println("lot number must be an integer");
                input.next(); // Prevents infinite loop
            }

        }
        return lotNumber;
    }

    // requestAddress asks for and validates an address
    public String requestAddress() {
        Scanner input = new Scanner(System.in);
        String address = "";
        boolean isValid = false;

        // Continues to request input until valid
        while (!isValid) {
            System.out.println("Enter the address: ");
            if (input.hasNextLine()) { // Checks if input is a string
                address = input.nextLine();
                if (address.length() > 0) { // Checks if input is greater than 0 characters
                    isValid = true; // Breaks the loop if all conditions are met
                } else {
                    System.out.println("address must be greater than 0 characters");
                }
            } else {
                System.out.println("address must be a string");
                input.next(); // Prevents infinite loop
            }

        }
        return address;
    }

    // requestLandArea asks for and validates the landArea
    public double requestLandArea() {
        Scanner input = new Scanner(System.in);
        double landArea = 0;
        boolean isValid = false; // Flag to break loop

        // Continues to request input until valid
        while (!isValid) {
            System.out.println("Enter the land area: ");
            if (input.hasNextDouble()) { // Checks if input is a double
                landArea = input.nextDouble();
                if (landArea > 0) { // Checks if input is greater than 0
                    isValid = true; // Breaks the loop if all conditions are met
                } else {
                    System.out.println("land area must be greater than 0");
                }
            } else {
                System.out.println("land area must be a double");
                input.next(); // Prevents infinite loop
            }

        }
        return landArea;
    }

    // Add a new house and land object to the array
    public void addHouseAndLand() {

    }

    public void displayLands() {
        if (landList.isEmpty()){
            System.out.println("No land info stored");
        } else {
            for (Land land : landList) {
                System.out.println(land);
            }
        }

    }
    public void displayHouseAndLands(){

    }

    public void awaitInput(){

    }

    public void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final IOException e) {
            //  Handle any exceptions.
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.addLand();
        main.addLand();
        main.addLand();

        main.displayLands();


    }
}