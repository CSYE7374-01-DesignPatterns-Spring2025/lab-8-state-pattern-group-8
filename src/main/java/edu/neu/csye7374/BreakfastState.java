package edu.neu.csye7374;

public class BreakfastState implements RestaurantState {

    @Override
    public void displayMenu() {
        System.out.println("Breakfast Menu:");
        System.out.println("ITEM      PRICE      DESCRIPTION");
        System.out.println("1         $4.99      cereal");
        System.out.println("2         $5.99      oatmeal");
        System.out.println("3         $6.99      eggs");
        System.out.println("4         $7.99      pancakes");
        System.out.println("5         $3.99      bagel");
    }

    @Override
    public void placeOrder(int itemNumber) {
        switch (itemNumber) {
            case 1:
                System.out.println("Ordering cereal");
                break;
            case 2:
                System.out.println("Ordering oatmeal");
                break;
            case 3:
                System.out.println("Ordering eggs");
                break;
            case 4:
                System.out.println("Ordering pancakes");
                break;
            case 5:
                System.out.println("Ordering bagel");
                break;
            default:
                System.out.println("Invalid order");
        }
    }
}