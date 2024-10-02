package onlineShoppingPlatform;

import java.util.ArrayList;

/***
 * The Customer class represents a customer in the online shopping platform.
 * Each customer has a name and a shopping cart to store selected products.
 */
public class Customer {

    // The name of the customer.
    private String name;

    // The shopping cart associated with the customer.
    private ShoppingCart cart;

    /***
     * Constructor for the Customer class.
     * Initializes the customer with the given name and creates an empty shopping cart.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart(); // Each customer starts with a new empty shopping cart.
    }

    /***
     * Returns the shopping cart associated with the customer.
     * This method provides access to the cart for adding items or viewing cart contents.
     *
     * @return The customer's shopping cart.
     */
    public ShoppingCart get(){
        return cart;
    }

    /***
     * Overrides the toString method to return the customer's name.
     * This can be useful for logging or displaying the customer name in various operations.
     *
     * @return The name of the customer as a string.
     */
    public String toString(){
        return name;
    }
}
