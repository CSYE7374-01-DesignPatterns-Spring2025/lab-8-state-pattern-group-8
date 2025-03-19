package edu.neu.csye7374;

public class LunchState implements RestaurantState {
    @Override
    public void displayMenu() {
        System.out.println("Lunch Menu:");
        System.out.println("ITEM      PRICE      DESCRIPTION");
        System.out.println("1         $1.99      hot dog");
        System.out.println("2         $2.99      salad");
        System.out.println("3         $3.99      hamburger");
        System.out.println("4         $4.99      Eggs");
    }

    @Override
    public void placeOrder(int itemNumber) {
        switch (itemNumber) {
            case 1:
                System.out.println("Ordering hot dog");
                break;
            case 2:
                System.out.println("Ordering salad");
                break;
            case 3:
                System.out.println("Ordering hamburger");
                break;
            case 4:
                System.out.println("Ordering eggs");
                break;
            default:
                System.out.println("Invalid order");
        }
    }
}