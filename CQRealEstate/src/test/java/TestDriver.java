import java.time.LocalDate;

public class TestDriver {
    public static void main(String[] args) {
        // Uncomment to run a test

        // AddSaleTest.main(args);
        // DisplayLandsTest.main(args);
        // DisplayHouseAndLandsTest.main(args);
        // displayBothPropertiesTest.main(args);
        // DisplayBuyersTest.main(args);
        // DisplaySellersTest.main(args);

        // getBuyerTest.main(args);
        // getSellerTest.main(args);
        // getPropertyTest.main(args);
        // requestValidIntTest.main(args);
         requestValidDoubleTest.main(args);
    }
    
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
    public static class AddSaleTest {
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

    public static class DisplayLandsTest {
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

    public static class DisplayHouseAndLandsTest {
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

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

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

    public static class addSaleTest {
        public static void main(String[] args) {
            Main main = new Main();

            main.buyerList.add(new Buyer("John", "Smith", "1 Main Street", "12345678"));
            main.buyerList.add(new Buyer("Jane", "Doe", "2 Main Street", "87654321"));
            main.buyerList.add(new Buyer("Jack", "Black", "3 Main Street", "12345678"));

            main.sellerList.add(new Seller("John", "Smith", "1 Main Street", "12345678"));
            main.sellerList.add(new Seller("Jane", "Doe", "2 Main Street", "87654321"));
            main.sellerList.add(new Seller("Jack", "Black", "3 Main Street", "12345678"));

            main.landList.add(new Land(1, "1 Main Street", 1000));
            main.landList.add(new Land(2, "2 Main Street", 2000));
            main.landList.add(new Land(3, "3 Main Street", 3000));

            main.houseAndLandList.add(new HouseAndLand(1, "1 Main Street", 1000, 4, 2, 2));
            main.houseAndLandList.add(new HouseAndLand(2, "2 Main Street", 2000, 5, 3, 3));
            main.houseAndLandList.add(new HouseAndLand(3, "3 Main Street", 3000, 6, 4, 4));

            main.addSale();
        }
    }



}



