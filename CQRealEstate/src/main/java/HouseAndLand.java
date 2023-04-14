public class HouseAndLand extends Land {

    private static final String type = "House and Land";
    private double constructedArea;
    private int bedrooms;
    private int toilets;

    public HouseAndLand(int lotNumber, String address, double landArea, double constructedArea, int bedrooms, int toilets) {
        super(lotNumber, address, landArea);
        this.constructedArea = constructedArea;
        this.bedrooms = bedrooms;
        this.toilets = toilets;
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

    @Override
    public String toString(){
        return super.toString()
                + "\nConstructed area: " + constructedArea
                + "\nBedrooms: " + bedrooms
                + "\nToilets: " + toilets;
    }

}