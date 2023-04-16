import java.time.LocalDate;

public class TestDriver {
    public static void main(String[] args) {
        // AddSaleTest.main(args); // Uncomment to run AddSaleTest
        // DisplayLandsTest.main(args); // Uncomment to run DisplayLandsTest
        // DisplayHouseAndLandsTest.main(args); // Uncomment to run DisplayHouseAndLandsTest
        // displayBothPropertiesTest.main(args); // Uncomment to run displayBothPropertiesTest
        // DisplayBuyersTest.main(args); // Uncomment to run DisplayBuyersTest
        // DisplaySellersTest.main(args); // Uncomment to run DisplaySellersTest

        // getBuyerTest.main(args); // Uncomment to run getBuyerTest
        // getSellerTest.main(args); // Uncomment to run getSellerTest
         getPropertyTest.main(args); // Uncomment to run getPropertyTest
    }

    public class AddSaleTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.landList.add(new Land(1, "1 Main Street", 1000));
            main.landList.add(new Land(2, "2 Main Street", 2000));
            main.landList.add(new Land(3, "3 Main Street", 3000));

            main.houseAndLandList.add(new HouseAndLand(1, "1 Main Street", 1000, 4, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Main Street", 2000, 5, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Main Street", 3000, 6, 4, 4));

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

            main.sellerList.add(new Seller("John", "Smith", "1 Main Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Main Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Main Street", "12345678"));

            main.addSale();

        }
    }

    public class DisplayLandsTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.landList.add(new Land(1, "1 Main Street", 1000));
            main.landList.add(new Land(2, "2 Main Street", 2000));
            main.landList.add(new Land(3, "3 Main Street", 3000));

            System.out.println("Displaying lands in brief:\n");
            main.displayLands("brief");

            System.out.println("\nDisplaying lands in full:\n");
            main.displayLands("full");
        }
    }

    public class DisplayHouseAndLandsTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.houseAndLandList.add(new HouseAndLand(1, "1 Main Street", 1000, 4, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Main Street", 2000, 5, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Main Street", 3000, 6, 4, 4));

            System.out.println("Displaying house and lands in brief:\n");
            main.displayHouseAndLands("brief");

            System.out.println("\nDisplaying house and lands in full:\n");
            main.displayHouseAndLands("full");
        }
    }

    public class displayBothPropertiesTest {
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

    public class DisplayBuyersTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

            System.out.println("Displaying buyers in brief:\n");
            main.displayBuyers("brief");

            System.out.println("\nDisplaying buyers in full:\n");
            main.displayBuyers("full");
        }
    }

    public class DisplaySellersTest {
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

    public class getBuyerTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

            main.getBuyer();
        }
    }

    public class getSellerTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.sellerList.add(new Seller("John", "Smith", "1 Main Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Main Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Main Street", "12345678"));

            main.getSeller();
        }
    }

    public class getPropertyTest {
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



