package dmart.Program;

public class Customer {
    public static void main(String[] args) {
        Dmart cart1 = new FoodCart();
        Dmart cart2 = new Trends();

        System.out.println("Customer visiting FoodCart:");
        cart1.viewOffers();
        cart1.buyProduct("Burger", 99.0);
       

        System.out.println("\nCustomer visiting Trends:");
        cart2.viewOffers();
        cart2.buyProduct("T-Shirt", 499.0);
    }
}