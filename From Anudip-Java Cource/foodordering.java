import java.util.Scanner;

public class foodordering {
    public static double runningTotal = 0;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    //---------------------------------------------------------------
    // first just give a message of menu 
    public static void menu(String category) {
        System.out.println("Welcome to the Food Ordering System!");
        System.out.println("Please select a category: " + category);
        System.out.println("1. Burger (₹110)");
        System.out.println("2. Fries (₹60)");
        System.out.println("3. Soda (₹30)");
        System.out.println("4. Done");
    }

    //-----------------------------------------------------
    // after ordering, show us what we have ordered
    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            System.out.println("You've ordered a burger");
            itemPrice = 110;
        }
        if (foodItem == 2) {
            System.out.println("You've ordered fries");
            itemPrice = 60;
        }
        if (foodItem == 3) {
            System.out.println("You've ordered a soda");
            itemPrice = 30;
        }
        quantity();
        return itemPrice;
    }
    
    //-------------------------------------------------------
    // Now ask customer, Quantity of that order

    public static double quantity() {
        System.out.println("Enter quantity:");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    
    //--------------------------------------------------------------------------------------
    // Now calculate the total and show us in a reply
    
    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: ₹" + subTotal);
        
        // ------------------------------------------------------------------
        // after ordering food, ask customer if they wants to order dessert?

        System.out.println("Do you want to add a dessert? (yes/no)");
        String dessertChoice = input.next();
        if (dessertChoice.equalsIgnoreCase("yes")) {
            System.out.println("Please select a dessert:");
            System.out.println("1. Ice Cream (₹50)");
            System.out.println("2. Cake (₹80)");

            int dessertOption = input.nextInt();
            double dessertPrice = 0;
            if (dessertOption == 1) {
                System.out.println("You've ordered Ice Cream");
                dessertPrice = 50;
            } else if (dessertOption == 2) {
                System.out.println("You've ordered Cake");
                dessertPrice = 80;
            }

            System.out.println("Enter dessert quantity:");
            double dessertQuantity = input.nextDouble();
            double dessertSubtotal = dessertQuantity * dessertPrice;
            System.out.println("Subtotal (Dessert): ₹" + dessertSubtotal);

            subTotal += dessertSubtotal;
        }

        runningTotal += subTotal;
        return subTotal;
    }
    
    
    // ------------------------------------------------------------------
    // show the total amount and then give a message of enjoy your meal

    public static void done() {
        ordering = false;
        System.out.println("Your total amount is: ₹" + runningTotal);
        System.out.println("Enjoy your meal!");
    }

    
    // ------------------------------------------------------------------
    // after running code , first ask us whether we want veg or non-veg
    
    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);

        System.out.println("Please select a category:");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        int categoryChoice = input.nextInt();

        String category = "";
        if (categoryChoice == 1) {
            category = "Veg";
        } else if (categoryChoice == 2) {
            category = "Non-Veg";
        }

        do {
            menu(category);
            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                    done();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ordering);
    }
}


