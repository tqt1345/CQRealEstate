public class Land {
    private int landId;
    private static int lastLandId = 0;
    private int lotNumber;
    private String address;
    private double landArea;

    public Land(int lotNumber, String address, double landArea) {
        this.lotNumber = lotNumber;
        this.address = address;
        this.landArea = landArea;
        this.landId = lastLandId;
        lastLandId++;
    }

    // landId getter
    public int getLandId() {
        return landId;
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
        return "Lot number: " + lotNumber
                + "\nAddress: " + address
                + "\nLand area: " + landArea ;
    }
}