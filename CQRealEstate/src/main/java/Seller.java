public class Seller extends Client {

    private String clientType = "Seller";
    public Seller(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
        this.clientType = clientType;
    }

    // Getters and setters
    public String getClientType() {return this.clientType;}
    public void setClientType(String clientType) {this.clientType = clientType;}
    
    @Override
    public String toString() {
        return "Client type: " + clientType
                + "\n"
                + super.toString();
    }
}