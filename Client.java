public class Client {

    private int clientID;
    private String name;
    private String address;
    private String phoneNumber;

    // Client constructor
    public Client(int clientID, String name, String address, String phoneNumber) {
        this.clientID = clientID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // clientID setter
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // address setter
    public void setAddress(String address) {
        this.address = address;
    }

    // phoneNumber setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // clientID getter
    public int getClientID() {
        return clientID;
    }

    // name getter
    public String getName() {
        return name;
    }

    // address getter
    public String getAddress() {
        return address;
    }

    // phoneNumber getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
