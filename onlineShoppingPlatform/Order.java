package onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.PaymentFailedException;

import java.util.ArrayList;
import java.util.Date;

/***
 * The Order class represents a customer's order in the online shopping platform.
 * It captures the customer details and the items they ordered.
 */
public class Order {

    // The customer who placed the order.
    private Customer customer;

    // A list of products ordered by the customer.
    private ArrayList<Product> orderedItems;

    /***
     * Constructor for the Order class.
     * It initializes the order with the customer and retrieves the items from the customer's shopping cart.
     *
     * @param customer The customer placing the order.
     */
    public Order(Customer customer) {
        this.customer = customer;
        this.orderedItems = (ArrayList<Product>) customer.get().getItems();
    }

    /***
     * Places the order by displaying the customer details and the list of ordered items.
     * It also counts and prints the total number of items ordered.
     */
    public void placeOrder() {
        int count = 0;
        System.out.println();
        System.out.println("***************************************");
        System.out.println("Order placed for customer: " + customer);
        System.out.println("Ordered Items: ");
        System.out.println("=======================================");
        for (Product prod : orderedItems) {
            System.out.println(prod);
            count++;
        }
        System.out.println("Total number of items that you have ordered: " + count);
    }
}
