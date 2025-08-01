package dmart.Program;

class Trends implements Dmart {
    @Override
    public void buyProduct(String productName, double price) {
        System.out.println("Trends: You bought " + productName + " for ₹" + price);
    }

    @Override
    public void viewOffers() {
        System.out.println("Trends Offers: Flat 40% off on fashion wear!");
    }
}
