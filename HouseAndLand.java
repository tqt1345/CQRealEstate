public class HouseAndLand extends Land{
    private double houseArea; // houseArea to be in meters squared
    private int bedrooms;
    private int bathrooms;

    // HouseAndLand constructor
    public HouseAndLand(int lotNumber, String address, double landArea, double houseArea, int bedrooms, int bathrooms) {
        super(lotNumber, address, landArea);
        this.houseArea = houseArea;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    // lotNumber setter
    public void setLotNumber(int lotNumber) {
        super.setLotNumber(lotNumber);
    }

    // address setter
    public void setAddress(String address) {
        super.setAddress(address);
    }

    // landArea setter
    public void setLandArea(float landArea) {
        super.setLandArea(landArea);
    }

    // houseArea setter
    public void setHouseArea(double houseArea) {
        this.houseArea = houseArea;
    }

    // bedrooms setter
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    // bathrooms setter
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    // lotNumber getter
    public int getLotNumber() {
        return super.getLotNumber();
    }

    // address getter
    public String getAddress() {
        return super.getAddress();
    }

    // landArea getter
    public double getLandArea() {
        return super.getLandArea();
    }

    // houseArea getter
    public double getHouseArea() {
        return houseArea;
    }

    // bedrooms getter
    public int getBedrooms() {
        return bedrooms;
    }

    // bathrooms getter
    public int getBathrooms() {
        return bathrooms;
    }





}