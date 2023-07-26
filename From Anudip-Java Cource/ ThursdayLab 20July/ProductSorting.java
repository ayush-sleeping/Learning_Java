package ThursdayLab_20July;

/* Q)Define Product class with name, price in double, sort it price wise (use comparable interface) . */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSorting implements Comparable<ProductSorting> {
	/* By implementing the Comparable interface, 
	   we indicate that objects of this class can be compared with other objects of the same class for sorting. */
    private String name;
    private double price;

    
// ---------------------------------------------------------------------------------------------------------
    public ProductSorting(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // *CompareTo method is used for comparing two products based on their prices ::
    @Override
    public int compareTo(ProductSorting otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    // *toString method is automatically called when we try to print the product object ::
    @Override
    public String toString() {
        return "Product: " + name + ", Price: ₹" + price;
    }

    
// -----------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        List<ProductSorting> products = new ArrayList<>();

     // Adding essential food items for cooking
        products.add(new ProductSorting("Rice (5 kg)", 599.99));
        products.add(new ProductSorting("Flour (2 kg)", 189.95));
        products.add(new ProductSorting("Cooking Oil (1 liter)", 199.50));
        products.add(new ProductSorting("Onions (1 kg)", 39.50));
        products.add(new ProductSorting("Tomatoes (1 kg)", 95.00));
        products.add(new ProductSorting("Potatoes (2 kg)", 60.00));

        // Finding the highest and lowest price products ::
        ProductSorting highestPriceProduct = Collections.max(products);
        ProductSorting lowestPriceProduct = Collections.min(products);


        // Printing the list of products
        System.out.println("Here is your shopping list:");
        for (ProductSorting product : products) {
            System.out.println(product);
        }

        // Sorting the list of products using the natural ordering (price-wise) ::
        Collections.sort(products);
      
        // Printing the sorted list of products
        System.out.println("\nYour shopping list after sorting by price:");
        for (ProductSorting product : products) {
            System.out.println(product);
        }
     
        // Printing the product with the highest price
        System.out.println("\nYour most expensive item:");
        System.out.println(highestPriceProduct);
        // This line prints the product with the highest price using the overridden toString method ::

     
        // Printing the product with the lowest price
        System.out.println("\nYour best deal:");
        System.out.println(lowestPriceProduct);

        // Finding the total cost of all products ::
        double totalCost = 0;
        for (ProductSorting product : products) {
            totalCost += product.price;
        }
     
        // Printing the total cost of all products
        System.out.println("\nTotal bill amount: ₹" + totalCost);
    }
}
