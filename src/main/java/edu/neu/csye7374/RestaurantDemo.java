package edu.neu.csye7374;

public class RestaurantDemo {
	public static void demo() {
        Restaurant restaurant = new Restaurant();
        
        // Demonstrate breakfast menu
        System.out.println("Demonstrating Breakfast Menu:");
        restaurant.setState(new BreakfastState());
        restaurant.showMenu();
        restaurant.placeOrder(3);
        System.out.println();
        
        // Demonstrate lunch menu
        System.out.println("Demonstrating Lunch Menu:");
        restaurant.setState(new LunchState());
        restaurant.showMenu();
        restaurant.placeOrder(4);
        System.out.println();
        
        // Demonstrate dinner menu
        System.out.println("Demonstrating Dinner Menu:");
        restaurant.setState(new DinnerState());
        restaurant.showMenu();
        restaurant.placeOrder(2);

        
   }
	}

