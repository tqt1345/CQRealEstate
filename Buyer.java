public class Buyer extends Client{
    // Buyer constructor

    private static final String clientType = "Buyer";
    public Buyer(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName,address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Client type: " + clientType
                + "\n"
                + super.toString();
    }
}
