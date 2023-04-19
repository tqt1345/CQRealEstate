// Programmer: Tarique Turnbull
// StudentID: 12177936
// Date: 18/04/2023
// Course: COIT11134 Object-Oriented Programming
// Assessment: Practical Assessment 1

/*
Please note: External resources such Stackoverflow, Youtube tutorials,
web articles, and artificial intelligence were used to help brainstorm and debug code in this
program.
 */

import java.util.ArrayList;

public class Main {

    // Object array lists
    ArrayList<Land> landList = new ArrayList<>();
    ArrayList<HouseAndLand> houseAndLandList = new ArrayList<>();
    ArrayList<Buyer> buyerList = new ArrayList<>();
    ArrayList<Seller> sellerList = new ArrayList<>();
    ArrayList<Sale> saleList = new ArrayList<>();

    // Interactive menu
    public void menu() {
        boolean isTrue = true; // Flag determines if user has quit

        // Continues to display the menu until user selects quit option

        while (isTrue) {
            System.out.println("""
                    Welcome to CQ Real Estate
                    Please select one of options:

                    1. Create a new Land entry
                    2. Create a new house and land entry
                    3. Create a new Buyer entry
                    4. Create a new Seller entry
                    5. Create a new Sale entry
                    6. Display all Land entries
                    7. Display all house and land entries
                    8. Display all buyer entries
                    9. Display all seller entries
                    10. Search for a Sale entry
                    11. Quit""");

            System.out.println();
            int input = Validator.requestValidInt("Enter your choice: ", 0, 11);
            switch (input) { // Performs actions based on use selection
                case 1:
                    System.out.println("Creating a new Land entry");
                    System.out.println(Util.separator(30));
                    addLand();
                    Util.moveOn(); // Waits for user input before returning to the menu
                    break;
                case 2:
                    System.out.println("Creating a new house and land entry");
                    System.out.println(Util.separator(30));
                    addHouseAndLand();
                    Util.moveOn();
                    break;
                case 3:
                    System.out.println("Creating a new Buyer entry");
                    System.out.println(Util.separator(30));
                    addBuyer();
                    Util.moveOn();
                    break;
                case 4:
                    System.out.println("Creating a new Seller entry");
                    System.out.println(Util.separator(30));
                    addSeller();
                    Util.moveOn();
                    break;
                case 5:
                    System.out.println("Creating a new Sale entry");
                    System.out.println(Util.separator(30));
                    addSale();
                    Util.moveOn();
                    break;
                case 6:
                    System.out.println("Displaying all Land entries");
                    System.out.println(Util.separator(30));
                    displayLands("full");
                    Util.moveOn();
                    break;
                case 7:
                    System.out.println("Displaying all house and land entries");
                    System.out.println(Util.separator(30));
                    displayHouseAndLands("full");
                    Util.moveOn();
                    break;
                case 8:
                    System.out.println("Displaying all buyer entries");
                    System.out.println(Util.separator(30));
                    displayBuyers("full");
                    Util.moveOn();
                    break;
                case 9:
                    System.out.println("Displaying all seller entries");
                    System.out.println(Util.separator(30));
                    displaySellers("full");
                    Util.moveOn();
                    break;
                case 10:
                    System.out.println("Searching for a Sale entry");
                    System.out.println(Util.separator(30));
                    searchSales();
                    Util.moveOn();
                    break;
                case 11:
                    isTrue = false;
                    break;
            }
        }
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
        Util.clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(land);

    }

    // Displays either brief or full details for all Land objects
    public void displayLands(String type) {
        // Checks if the array is empty
        if (landList.isEmpty()) {
            System.out.println("No land info stored");
            return;
        }

        switch (type) { // Brief or full details shown depending on type argument
            case "brief":
                for (Land land : landList) {
                        System.out.println("ID: " + land.getLandId() + " Type: " + land.getType()); // Displays only the ID of each object
                }
                break;
            case "full":
                for (Land land : landList) {
                        System.out.println(land + "\n"); // Displays the toString info of each object
                }
                break;
        }
    }

    // Add a new HouseAndLand object to the array
    public void addHouseAndLand() {
        // Get houseAndLand attributes
        int lotNumber = Validator.requestValidInt("Enter the lot number", 0);
        String address = Validator.requestValidString("Enter the address", "address", 0);
        double constructedArea = Validator.requestValidDouble("Enter the constructed area", 0);
        double landArea = Validator.requestValidDouble("Enter the land area (must be greater than " + constructedArea + ")", constructedArea);
        int bedrooms = Validator.requestValidInt("Enter the number of bedrooms", 0);
        int toilets = Validator.requestValidInt("Enter the number of toilets", 0);

        // Create new HouseAndLand object and add it to the array
        HouseAndLand houseAndLand = new HouseAndLand(lotNumber, address, landArea, constructedArea, bedrooms, toilets);
        houseAndLandList.add(houseAndLand);

        // Display inputted details for the newly created land object
        Util.clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(houseAndLand);

    }

    // Displays either brief or full details for all HouseAndLand objects
    public void displayHouseAndLands(String type){

        // Error if there are no objects in the array
        if (houseAndLandList.isEmpty()) {
            System.out.println("No house and land info stored");
            return;
        }

        switch (type) { // Brief or full details shown depending on type argument
            case "brief":
                for (Land houseAndLand : houseAndLandList) {
                        System.out.println("ID: " + houseAndLand.getLandId() + " Type: " + houseAndLand.getType()); // Displays only the ID of each object
                }
                break;
            case "full":
                for (Land houseAndLand : houseAndLandList) {
                        System.out.println(houseAndLand + "\n"); // Displays the toString info of each object
                }
                break;
        }
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
        Util.clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(buyer);

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
        Util.clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(seller);

    }

    public void addSale() {
        // Checking for existing entries. Does not add a new sale if lists are empty
        if (landList.isEmpty() && houseAndLandList.isEmpty()) {
            System.out.println("Can't add new entry, there are no property entries");
            return;
        }
        if (sellerList.isEmpty() && buyerList.isEmpty()) {
            System.out.println("Can't add new entry, there are no seller or buyer entries");
            return;
        }
        if (sellerList.isEmpty()) {
            System.out.println("Can't add new entry, there are no seller entries");
            return;
        }
        if (buyerList.isEmpty()) {
            System.out.println("Can't add new entry, there are no buyer entries");
            return;
        }

        // Get sale attributes
        String date = Validator.requestValidDate();
        double soldPrice = Validator.requestValidDouble("Enter the sold price", 0);
        Land property = getProperty();
        Seller seller = getSeller();
        Buyer buyer = getBuyer();

        // Create new Sale object and add it to the array
        Sale sale = new Sale(date, soldPrice, property, seller, buyer);
        saleList.add(sale);

        Util.clearConsole();
        System.out.println("You have created a new entry with the following details:\n");
        System.out.println(sale);

    }

    // Displays either brief or full details for all Sale objects
    public void displaySales(String type) {
        // Checks if list is empty
        if (saleList.isEmpty()) {
            System.out.println("No sales info stored");
            return;
        }

        switch (type) { // Brief or full details shown depending on type argument
            case "brief":
                for (Sale sale : saleList) {
                    System.out.println("ID: " + sale.getSaleID()
                            + " Date: " + sale.getDate()
                            + " Sold Price: " + sale.getSoldPrice()); // Displays only the ID of each object
                }
                break;
            case "full":
                for (Sale sale : saleList) {
                    System.out.println(sale + "\n"); // Displays the toString info of each object
                }
                break;
        }
    }

    // Displays sale info based on user inputted saleId
    public void searchSales() {
        // Checks if list is empty
        if (saleList.isEmpty()) {
            System.out.println("No sales info stored");
            return;
        }

        System.out.println("Select a sale ID from below:\n");
        displaySales("brief");

        // Continue to request sale ID until correct
        while (true) {
            int input = Validator.requestValidInt("Enter the ID of the sale", 0); // Request sale ID
            for (Sale sale : saleList) {
                if (sale.getSaleID() == input) { // Checks if inputted ID exists in the array
                    System.out.println("You have selected a sale with the following info: \n" +
                            sale + "\n");
                    return;
                }
            }
        }

    }

    // Returns a buyer object depending on the ID entered
    public Buyer getBuyer() {

        System.out.println("Select a buyer ID from below:\n");
        displayBuyers("brief");

        // Continue to request buyer ID until correct
        while (true) {
            int input = Validator.requestValidInt("Enter the ID of the buyer", 0); // Request buyer ID
            for (Buyer buyer : buyerList) {
                if (buyer.getClientID() == input) { // Checks if inputted ID exists in the array
                    System.out.println("You have selected a buyer with the following info: \n" +
                            buyer + "\n");
                    return buyer;
                }
            }
            System.out.println("Buyer not found with ID " + input);
        }
    }

    // Returns a seller object depending on the ID entered
    public Seller getSeller() {
        System.out.println("Select a seller ID from below:\n");
        displaySellers("brief");

        // Continue to request seller ID until correct
        while (true) {
            int input = Validator.requestValidInt("Enter the ID of the seller", 0);
            for (Seller seller : sellerList) {
                if (seller.getClientID() == input) { // Checks if inputted ID exists in the array
                    System.out.println("You have selected a seller with the following info: \n" +
                            seller + "\n");
                    return seller;
                }
            }
            System.out.println("Seller not found with ID " + input);
        }
    }


    // Returns a land object depending on the ID entered
    public Land getProperty() {
        int propertyTypeChoice;

        while (true) {
            System.out.println("Select the property type being sold:\n");
            System.out.println("1. Land");
            System.out.println("2. House and Land");
            propertyTypeChoice = Validator.requestValidInt("Enter your choice: ", 0,3);

            switch (propertyTypeChoice) { // User selects property type to be sold
                case 1:
                    if (landList.isEmpty()) { // Can't add land if the list is empty
                        System.out.println("Invalid, no land entries");
                        continue;
                    } else {
                        while (true) { // If landLisnt isnt empty, requests user select landId
                            System.out.println("Select the land from the list below\n");
                            displayLands("brief");
                            int input = Validator.requestValidInt("Enter the ID of the land", 0);
                            for (Land land : landList) {
                                if (land.getLandId() == input) { // Checks if inputted ID exists in the array
                                    System.out.println("You have selected a land with the following info: \n\n" +
                                            land + "\n");
                                    return land;
                                }
                            }
                            System.out.println("Land not found with ID " + input + "\n");
                        }
                    }
                case 2: // Same as case 1 but for house and land
                    if (houseAndLandList.isEmpty()) {
                        System.out.println("Invalid, no house and land entries");
                    } else {
                        while (true) {
                            System.out.println("Select the house and land from the list below\n");
                            displayHouseAndLands("brief");
                            int input = Validator.requestValidInt("Enter the ID of the house and land", 0);
                            for (HouseAndLand houseAndLand : houseAndLandList) {
                                if (houseAndLand.getLandId() == input) { // Checks if inputted ID exists in the array
                                    System.out.println("You have selected a house and land with the following info: \n\n" +
                                            houseAndLand + "\n");
                                    return houseAndLand;
                                }
                            }
                            System.out.println("House and land not found with ID " + input + "\n");
                        }
                    }
            }
        }
    }

    // Displays either brief or full details for all Buyer objects
    public void displayBuyers(String type){
        // Checks if the buyerList is empty
        if (buyerList.isEmpty()){
            System.out.println("No buyer info stored");
            return;
        }

        switch (type) { // Shows brief or full details depending on type argument
            case "brief":
                for (Buyer buyer : buyerList) {
                    System.out.println("ID: " + buyer.getClientID()
                            + ", Name: " + buyer.getFirstName()
                            + ", Type: " + buyer.getClientType()); // Displays only the ID of each object
                }
                break;
            case "full":
                for (Buyer buyer : buyerList) {
                    System.out.println(buyer + "\n"); // Displays the toString info of each object
                }
                break;
        }
    }

    // Displays either brief or full details for all Seller objects
    public void displaySellers(String type){
        // Checks if the sellerList is empty
        if (sellerList.isEmpty()){
            System.out.println("No seller info stored");
            return;
        }

        switch (type) { // Shows brief or full details depending on type argument
            case "brief":
                for (Seller seller : sellerList) {
                    System.out.println("ID: " + seller.getClientID()
                            + ", Name: " + seller.getFirstName()
                            + ", Type: " + seller.getClientType()); // Displays only the ID of each object
                }
                break;
            case "full":
                for (Seller seller : sellerList) {
                    System.out.println(seller + "\n"); // Displays the toString info of each object
                }
                break;
        }
    }

    // Shows a welcome message
    public void welcomeMessage() {
        System.out.println("""
                Welcome to CQ Real Estate
                 Student: Tarique Turnbull
                 Date: 10/10/2020
                 Course:\s
                 Assessment:\s""");
    }

    // Shows an exit message
    public void exitMessage() {
        System.out.println("Thank you for using the program");
    }
    // Main method to run the program
    public static void main(String[] args) {
        Main main = new Main();

        main.welcomeMessage();
        main.menu();
        main.exitMessage();

        System.exit(0);
    }
}