public class Seller extends Client {

    private static final String clientType = "Seller";
    public Seller(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Client type: " + clientType
                + "\n"
                + super.toString();
    }
}