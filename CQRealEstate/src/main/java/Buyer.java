public class Buyer extends Client {

    private String clientType = "Buyer";

    // Buyer constructor
    public Buyer(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName,address, phoneNumber);
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }

    @Override
    public String toString() {
        return "Client type: " + clientType
                + "\n"
                + super.toString();
    }
}
