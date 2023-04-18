import java.time.LocalDate;

public class TestDriver {
    public static void main(String[] args) {
        // Uncomment to run a test

        // ************************
        // Tests for creation of objects

        // addLandTest.main(args);
       //  addHouseAndLandTest.main(args);
       //  AddSaleTest.main(args);
       //  addBuyerTest.main(args);
        // getBuyerTest.main(args);
        // getSellerTest.main(args);
        // getPropertyTest.main(args);

        // ************************
        // Tests for displaying objects
        // DisplayLandsTest.main(args);
        // DisplayHouseAndLandsTest.main(args);
        // displayBothPropertiesTest.main(args);
        // DisplayBuyersTest.main(args);
        // DisplaySellersTest.main(args);
         searchSalesTest.main(args);

        // ************************
        // Tests for data validation

        // requestValidIntTest.main(args);
        // requestValidDoubleTest.main(args);
        // requestValidStringTest.main(args);
        // requestValidDateTest.main(args);



    }

    // Add object tests
    public static class addLandTest {
        public static void main(String[] args) {
            Main main = new Main();
            main.addLand();
        }
    }

    public static class addHouseAndLandTest {
        public static void main(String[] args) {
            Main main = new Main();
            main.addHouseAndLand();
        }
    }

    public static class AddSaleTest {
        public static void main(String[] args) {
            Main main = new Main();

            // Creating test objects for user selection
            main.landList.add(new Land(1, "1 Test Street", 1000));
            main.landList.add(new Land(2, "2 Test Street", 2000));
            main.landList.add(new Land(3, "3 Test Street", 3000));

            main.houseAndLandList.add(new HouseAndLand(1, "1 Test Street", 1000, 100, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Test Street", 2000, 200, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Test Street", 3000, 300, 4, 4));

            main.buyerList.add(new Buyer("Tarique", "Turnbull", "1 Test Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Test Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Test Street", "12345678"));

            main.sellerList.add(new Seller("Richard", "Maxwell", "1 Test Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Test Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Test Street", "12345678"));

            main.addSale();

        }
    }

    public static class addBuyerTest {
        public static void main(String[] args) {
            Main main = new Main();
            main.addBuyer();
        }
    }

    // Validator tests
    public static class requestValidIntTest {
        public static void main(String[] args) {
            int num = Validator.requestValidInt("Enter a number between 1 and 10", 0, 11);
            System.out.println("Number entered: " + num);
        }
    }

    public static class requestValidDoubleTest {
        public static void main(String[] args) {
            double num = Validator.requestValidDouble("Enter a double between 0.1 and 10 ", 0, 11);
            System.out.println("Number entered: " + num);
        }
    }

    public static class requestValidStringTest {
        public static void main(String[] args) {
            String name = Validator.requestValidString("Enter a name", "name", 0);
            System.out.println("Number entered: " + name);

            String address = Validator.requestValidString("Enter an address", "address", 0);
            System.out.println("Number entered: " + address);

            String phone = Validator.requestValidString("Enter a phone number", "phone", 8);
            System.out.println("Number entered: " + phone);
        }
    }

    public static class requestValidDateTest {
        public static void main(String[] args) {
            String date = Validator.requestValidDate();
            System.out.println("Date entered: " + date);
        }
    }

    // Display object tests
    public static class DisplayLandsTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.landList.add(new Land(1, "1 Test Street", 1000));
            main.landList.add(new Land(2, "2 Test Street", 2000));
            main.landList.add(new Land(3, "3 Test Street", 3000));

            System.out.println("Displaying lands in brief:\n");
            main.displayLands("brief");

            System.out.println("\nDisplaying lands in full:\n");
            main.displayLands("full");
        }
    }

    public static class DisplayHouseAndLandsTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.houseAndLandList.add(new HouseAndLand(1, "1 Test Street", 1000, 100, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Test Street", 2000, 200, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Test Street", 3000, 300, 4, 4));

            System.out.println("Displaying house and lands in brief:\n");
            main.displayHouseAndLands("brief");

            System.out.println("\nDisplaying house and lands in full:\n");
            main.displayHouseAndLands("full");
        }
    }

    public static class displayBothPropertiesTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.landList.add(new Land(1, "1 Main Street", 1000));
            main.landList.add(new Land(2, "2 Main Street", 2000));

            main.houseAndLandList.add(new HouseAndLand(1, "1 Main Street", 1000, 4, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Main Street", 2000, 5, 3, 3));

            System.out.println("Displaying lands in brief:\n");
            main.displayLands("brief");

            System.out.println("\nDisplaying lands in full:\n");
            main.displayLands("full");

            System.out.println("\nDisplaying house and lands in brief:\n");
            main.displayHouseAndLands("brief");

            System.out.println("\nDisplaying house and lands in full:\n");
            main.displayHouseAndLands("full");
        }
    }

    public static class DisplayBuyersTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.buyerList.add(new Buyer("Tarique", "Turnbull", "1 Test Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Fake Street", "87654321"));
            main.buyerList.add(new Buyer("Richard", "Maxwell", "3 Way Street", "12345678"));

            System.out.println("Displaying buyers in brief:\n");
            main.displayBuyers("brief");

            System.out.println("\nDisplaying buyers in full:\n");
            main.displayBuyers("full");
        }
    }

    public static class DisplaySellersTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.sellerList.add(new Seller("John", "Smith", "1 Main Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Main Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Main Street", "12345678"));

            System.out.println("Displaying sellers in brief:\n");
            main.displaySellers("brief");

            System.out.println("\nDisplaying sellers in full:\n");
            main.displaySellers("full");
        }
    }

    public static class searchSalesTest {
        public static void main(String[] args) {
            Main main = new Main();
            // Sale attributes
            String date = "11/11/2023";
            double soldPrice = 1000;

            // Creating test objects
            main.landList.add(new Land(1, "1 Test Street", 1000));
            main.buyerList.add(new Buyer("Tarique", "Turnbull", "1 Test Street", "12345678"));
            main.sellerList.add(new Seller("John", "Smith", "1 Test Street", "12345678"));

            // Create test sales
            main.saleList.add(new Sale(date, soldPrice, main.landList.get(0), main.sellerList.get(0), main.buyerList.get(0)));
            main.saleList.add(new Sale(date, soldPrice, main.landList.get(0), main.sellerList.get(0), main.buyerList.get(0)));
            main.saleList.add(new Sale(date, soldPrice, main.landList.get(0), main.sellerList.get(0), main.buyerList.get(0)));

            main.searchSales();
        }
    }

    // Get object tests
    public static class getBuyerTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

            main.getBuyer();
        }
    }

    public static class getSellerTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.sellerList.add(new Seller("John", "Smith", "1 Main Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Main Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Main Street", "12345678"));

            main.getSeller();
        }
    }

    public static class getPropertyTest {
        public static void main(String[] args) {
            Main main = new Main();

            // main.landList.add(new Land(1, "1 Main Street", 1000));
            // main.landList.add(new Land(2, "2 Main Street", 2000));
            // main.landList.add(new Land(3, "3 Main Street", 3000));

            main.houseAndLandList.add(new HouseAndLand(1, "1 Main Street", 1000, 4, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Main Street", 2000, 5, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Main Street", 3000, 6, 4, 4));

            main.getProperty();
        }
    }





}



