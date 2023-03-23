public class Sale {

    // Sale attributes
    private int saleID;
    private String date;
    private double soldPrice;
    private Property property;
    private Seller seller;
    private Buyer buyer;


    // Sale constructor
    public Sale(int saleID, String date, double soldPrice, Property property, Seller seller, Buyer buyer) {
        this.saleID = saleID;
        this.date = date;
        this.soldPrice = soldPrice;
        this.property = property;
        this.seller = seller;
        this.buyer = buyer;
    }

    // saleID setter
    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    // date setter
    public void setDate(String date) {
        this.date = date;
    }

    // soldPrice setter
    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    // property setter
    public void setProperty(Property property) {
        this.property = property;
    }

    // seller setter
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    // buyer setter
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    // saleID getter
    public int getSaleID() {
        return saleID;
    }

    // date getter
    public String getDate() {
        return date;
    }

    // soldPrice getter
    public double getSoldPrice() {
        return soldPrice;
    }

    // property getter
    public Property getProperty() {
        return property;
    }

    // seller getter
    public Seller getSeller() {
        return seller;
    }

    // buyer getter
    public Buyer getBuyer() {
        return buyer;
    }

    // TODO toString method

}
