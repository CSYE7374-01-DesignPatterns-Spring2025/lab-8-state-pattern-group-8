package edu.neu.csye7374;

public class DinnerState implements RestaurantState {
    @Override
    public void displayMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("ITEM      PRICE      DESCRIPTION");
        System.out.println("1         $11.99     soup");
        System.out.println("2         $12.99     salad");
        System.out.println("3         $13.99     steak");
        System.out.println("4         $14.99     salmon");
        System.out.println("5         $15.99     chicken");
    }

    @Override
    public void placeOrder(int itemNumber) {
        switch (itemNumber) {
            case 1:
                System.out.println("Ordering soup");
                break;
            case 2:
                System.out.println("Ordering salad");
                break;
            case 3:
                System.out.println("Ordering steak");
                break;
            case 4:
                System.out.println("Ordering salmon");
                break;
            case 5:
                System.out.println("Ordering chicken");
                break;
            default:
                System.out.println("Invalid order");
        }
    }
}
