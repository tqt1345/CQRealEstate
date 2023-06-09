
public class Sale {

    // Sale attributes
    private int saleID;
    private static int lastSaleID = 1;
    private String date;
    private double soldPrice;
    private Land property;
    private Seller seller;
    private Buyer buyer;

    // Sale constructor
    public Sale(String date, double soldPrice, Land property, Seller seller, Buyer buyer) {
        this.date = date;
        this.soldPrice = soldPrice;
        this.property = property;
        this.seller = seller;
        this.buyer = buyer;
        this.saleID = lastSaleID;
        lastSaleID++;
    }

    // Getters
    public int getSaleID() {return saleID;}
    public String getDate() {return date;}
    public double getSoldPrice() {return soldPrice;}
    public Land getProperty() {return property;}
    public Seller getSeller() {return seller;}
    public Buyer getBuyer() {return buyer;}

    // Setters
    public void setSaleID(int saleID) {this.saleID = saleID;}
    public void setDate(String date) {this.date = date;}
    public void setSoldPrice(double soldPrice) {this.soldPrice = soldPrice;}
    public void setProperty(Land property) {this.property = property;}
    public void setSeller(Seller seller) {this.seller = seller;}
    public void setBuyer(Buyer buyer) {this.buyer = buyer;}

    @Override
    public String toString(){
        return "Sale info:\n"
                + "\nSale ID: " + saleID
                + "\nDate: " + date
                + "\nSold price: " + soldPrice + "\n"
                + Util.separator(30)
                + "\nProperty info:\n\n" + property + "\n"
                + Util.separator(30)
                + "\nSeller info:\n\n" + seller + "\n"
                + Util.separator(30)
                + "\nBuyer info:\n\n" + buyer;

    }
}
