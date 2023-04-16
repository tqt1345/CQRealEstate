public class Land {
    private int propertyId;
    private static int lastPropertyId = 1;
    private String type = "Land";
    private int lotNumber;
    private String address;
    private double landArea;

    public Land(int lotNumber, String address, double landArea) {
        this.lotNumber = lotNumber;
        this.address = address;
        this.landArea = landArea;
        this.type = type;
        this.propertyId = lastPropertyId;
        lastPropertyId++;
    }

    // landId getter
    public int getLandId() {
        return propertyId;
    }

    // type getter and setter
    public String getType() {
        return this.type;
    }


    // lotNumber setter and getter
    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    // address setter and getter
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // landArea setter and getter
    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public double getLandArea() {
        return landArea;
    }

    @Override
    public String toString(){
        return "Property type: " + type
                + "\n" + "Property ID: " + propertyId
                + "\nLot number: " + lotNumber
                + "\nAddress: " + address
                + "\nLand area: " + landArea ;
    }
}