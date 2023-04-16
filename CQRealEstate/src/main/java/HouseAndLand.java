public class HouseAndLand extends Land {

    private String type = "HouseAndLand";
    private double constructedArea;
    private int bedrooms;
    private int toilets;

    public HouseAndLand(int lotNumber, String address, double landArea, double constructedArea, int bedrooms, int toilets) {
        super(lotNumber, address, landArea);
        this.constructedArea = constructedArea;
        this.bedrooms = bedrooms;
        this.toilets = toilets;
        this.type = type;
    }

    // constructedArea setter and getter
    public void setConstructedArea(double constructedArea) {
        this.constructedArea = constructedArea;
    }

    public double getConstructedArea() {
        return constructedArea;
    }

    // bedrooms setter and getter
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    // toilets setter and getter
    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public int getToilets() {
        return toilets;
    }

    // type getter
    public String getType() {
        return this.type;
    }

    @Override
    public String toString(){
        // Note: super.toString() is not called due to a difference in property type
        return "Property type: " + type
                + "\n" + "Property ID: " + getLandId()
                + "\nLot number: " + getLotNumber()
                + "\nAddress: " + getAddress()
                + "\nLand area: " + getLandArea()
                + "\nConstructed area: " + constructedArea
                + "\nBedrooms: " + bedrooms
                + "\nToilets: " + toilets;
    }

}