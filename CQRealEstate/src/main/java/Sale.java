
public class Sale {
    private int saleID;
    private static int lastSaleID = 1;
    private String date;
    private double soldPrice;
    private Land property;
    private Seller seller;
    private Buyer buyer;

    public Sale(String date, double soldPrice, Land property, Seller seller, Buyer buyer) {
        this.date = date;
        this.soldPrice = soldPrice;
        this.property = property;
        this.seller = seller;
        this.buyer = buyer;
        this.saleID = lastSaleID;
        lastSaleID++;
    }

    // saleID getter and setter
    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public int getSaleID() {
        return saleID;
    }

    // Date getter and setter
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    // soldPrice getter and setter
    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    // Property getter and setter
    public void setProperty(Land property) {
        this.property = property;
    }

    public Land getProperty() {
        return property;
    }

    // seller getter and setter
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    // buyer getter and setter
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    @Override
    public String toString(){
        return "Sale info:\n"
                + "\nSale ID: " + saleID
                + "\nDate: " + date
                + "\nSold price: " + soldPrice + "\n"
                + Main.separator(30)
                + "\nProperty info:\n\n" + property + "\n"
                + Main.separator(30)
                + "\nSeller info:\n\n" + seller + "\n"
                + Main.separator(30)
                + "\nBuyer info:\n\n" + buyer;

    }
}
