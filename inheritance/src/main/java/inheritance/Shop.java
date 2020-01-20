package inheritance;

public class Shop {
    // variables
    String shopName;
    String shopDescription;
    String avgPrice;

    // constructor
    public Shop(String shopName, String shopDescription, String avgPrice) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.avgPrice = avgPrice;
    }

    public String toString() {
        return "Name of shop: " + this.shopName + "\nDescription: " + this.shopDescription + "\nAverage price: " + this.avgPrice;
    }
}
