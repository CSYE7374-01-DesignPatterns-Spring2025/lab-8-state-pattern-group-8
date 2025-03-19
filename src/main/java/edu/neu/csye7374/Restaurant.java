package edu.neu.csye7374;

public class Restaurant {
    private RestaurantState state;
    
    public void setState(RestaurantState state) {
         this.state = state;
    }
    
    public void showMenu() {
         if (state != null) {
             state.displayMenu();
         } else {
             System.out.println("Restaurant is closed. No menu available.");
         }
    }
    
    public void placeOrder(int itemId) {
        if (state != null) {
            state.placeOrder(itemId);
        } else {
            System.out.println("Restaurant is closed. Cannot place order.");
        }
   }
}