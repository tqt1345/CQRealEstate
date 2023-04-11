
public class TestDriver {
    public static void main(String[] args) {
        Main main = new Main();

        main.addBuyer();
        main.addSeller();

        main.displayBuyers();
        main.displaySellers();

        main.addLand();
        main.addHouseAndLand();

        main.displayLands();
        main.displayHouseAndLands();

        System.out.println("Done");
    }
}

