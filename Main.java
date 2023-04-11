
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Object array lists
    ArrayList<Land> landList = new ArrayList<Land>();
    ArrayList<HouseAndLand> houseAndLandList = new ArrayList<HouseAndLand>();
    ArrayList<Buyer> buyerList = new ArrayList<Buyer>();
    ArrayList<Seller> sellerList = new ArrayList<Seller>();
    // Interactive menu
    public void menu() {
        
    }

    // Add a new Land object to the array
    public void addLand() {
        // Get land attributes
        int lotNumber = Validator.requestValidInt("Enter the lot number", 0);
        String address = Validator.requestValidString("Enter the address", "address", 0);
        double landArea = Validator.requestValidDouble("Enter the land area", 0);

        // Create new land object and add it to the array
        Land land = new Land(lotNumber, address, landArea);
        landList.add(land);

        // Display inputted details for the newly created land object
        clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(land);

        moveOn(); // Move on to the next part of the program after completion
    }

    // Add a new HouseAndLand object to the array
    public void addHouseAndLand() {
        // Get houseAndLand attributes
        int lotNumber = Validator.requestValidInt("Enter the lot number", 0);
        String address = Validator.requestValidString("Enter the address", "address", 0);
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

        moveOn(); // Move on to the next part of the program after completion
    }

    // Add a new Buyer object to the array
    public void addBuyer() {
        // Get buyer attributes
        String firstName = Validator.requestValidString("Enter the buyer's first name", "name", 0);
        String lastName = Validator.requestValidString("Enter the buyer's last name", "name", 0);
        String address = Validator.requestValidString("Enter the buyer's address", "address",0);
        String phoneNumber = Validator.requestValidString("Enter the buyer's 8 digit phone number", "phone", 8);

        // Create new Buyer object and add it to the array
        Buyer buyer = new Buyer(firstName, lastName, address, phoneNumber);
        buyerList.add(buyer);

        // Display inputted details for the newly created buyer object
        clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(buyer);

        moveOn(); // Move on to the next part of the program after completion
    }

    public void addSeller() {
        // Get seller attributes
        String firstname = Validator.requestValidString("Enter the seller's first name", "name", 0);
        String lastname = Validator.requestValidString("Enter the seller's last name", "name", 0);
        String address = Validator.requestValidString("Enter the seller's address", "address",0);
        String phoneNumber = Validator.requestValidString("Enter the seller's 8 digit phone number", "phone", 8);

        // Create new Seller object and add it to the array
        Seller seller = new Seller(firstname, lastname, address, phoneNumber);
        sellerList.add(seller);

        // Display inputted details for the newly created seller object
        clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(seller);

        moveOn(); // Move on to the next part of the program after completion
    }

    public void moveOn() {
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

    public void displayBuyers(){
        if (buyerList.isEmpty()){
            System.out.println("No buyer info stored");
        } else {
            for (Buyer buyer : buyerList) {
                System.out.println(buyer + "\n");
            }
        }
    }

    public void displaySellers(){
        if (sellerList.isEmpty()){
            System.out.println("No seller info stored");
        } else {
            for (Seller seller : sellerList) {
                System.out.println(seller + "\n");
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