public class HouseAndLand extends Property{

    // HouseAndLand attributes
    private double houseArea;
    private int bedrooms;
    private int bathrooms;

    // HouseAndLand constructor
    public HouseAndLand(int lotNumber, String address, double landArea, double houseArea, int bedrooms, int bathrooms) {
        super(lotNumber, address, landArea);
        this.houseArea = houseArea;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
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

    // houseArea getter
    public double getHouseArea() {
        return houseArea;
    }

    // bedrooms getter
    public int getBedrooms() {
        return bedrooms;
    }

    // TODO toString method
}