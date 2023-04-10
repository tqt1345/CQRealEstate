
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Object array lists
    ArrayList<Land> landList = new ArrayList<Land>();
    ArrayList<HouseAndLand> houseAndLandList = new ArrayList<HouseAndLand>();

    // Interactive menu
    public void menu() {
        
    }


    // Add a new Land object to the array
    public void addLand() {
        // Get land attributes
        int lotNumber = Validator.requestValidInt("Enter the lot number", 0);
        String address = Validator.requestValidString("Enter the address", 0);
        double landArea = Validator.requestValidDouble("Enter the land area", 0);

        // Create new land object and add it to the array
        Land land = new Land(lotNumber, address, landArea);
        landList.add(land);

        // Display inputted details for the newly created land object
        clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(land);

        // Wait for user input before continuing to the rest of the program
        System.out.println();
        awaitInput();
        clearConsole();
    }

    public void addHouseAndLand() {
        // Get houseAndLand attributes
        int lotNumber = Validator.requestValidInt("Enter the lot number", 0);
        String address = Validator.requestValidString("Enter the address", 0);
        double landArea = Validator.requestValidDouble("Enter the land area", 0);
        double constructedArea = Validator.requestValidDouble("Enter the constructed area (must be greater than: " + landArea, landArea);
        int bedrooms = Validator.requestValidInt("Enter the number of bedrooms", 0);
        int toilets = Validator.requestValidInt("Enter the number of toilets", 0);

        // Create new HouseAndLand object and add it to the array
        HouseAndLand houseAndLand = new HouseAndLand(lotNumber, address, landArea, constructedArea, bedrooms, toilets);
        houseAndLandList.add(houseAndLand);

        // Display inputted details for the newly created land object
        clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(houseAndLand);

        // Wait for user input before continuing to the rest of the program
        System.out.println();
        awaitInput();
        clearConsole();
    }

    public void displayLands() {
        if (landList.isEmpty()){
            System.out.println("No land info stored");
        } else {
            for (Land land : landList) {
                System.out.println(land + "\n");
            }
        }

    }
    public void displayHouseAndLands(){
        if (houseAndLandList.isEmpty()){
            System.out.println("No HouseAndLand info stored");
        } else {
            for (HouseAndLand houseAndLand : houseAndLandList) {
                System.out.println(houseAndLand + "\n");
            }
        }

    }

    public void awaitInput(){
        System.out.println("Press enter to continue");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addLand();
        main.addHouseAndLand();

        System.out.println("Total:");
        main.displayLands();
        main.displayHouseAndLands();
    }
}