public class Property {
    private int lotNumber;
    private String address;
    private double landArea; // landArea to be in meters squared
    // Property constructor
    public Property(int lotNumber, String address, double landArea) {
        this.lotNumber = lotNumber;
        this.address = address;
        this.landArea = landArea;
    }

    // lotNumber setter
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    // address setter
    public void setAddress(String address) {
        this.address = address;
    }

    // landArea setter
    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    // lotNumber getter
    public int getLotNumber() {
        return lotNumber;
    }

    // address getter
    public String getAddress() {
        return address;
    }

    // landArea getter
    public double getLandArea() {
        return landArea;
    }
}
