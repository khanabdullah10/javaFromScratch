package onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import java.util.List;
import java.util.ArrayList;

/***
 * The ShoppingCart class represents a customer's shopping cart in the online shopping platform.
 * It allows customers to add items, view the cart, calculate the total price, and clear the cart.
 */
public class ShoppingCart {

    private ArrayList<Product> items = new ArrayList<>();

    /***
     * Adds a product to the shopping cart.
     * If the product is null, an OutOfStockException is thrown.
     *
     * @param prod The product to be added to the cart.
     * @throws OutOfStockException if the product is unavailable or out of stock.
     */
    public void addItem(Product prod) throws OutOfStockException {
        if (prod == null) throw new OutOfStockException("The product is out of stock or unavailable.");
        else items.add(prod);
        System.out.println("[Added to the Cart: " + prod.getName() + "]");
    }

    /***
     * Displays the items currently in the shopping cart.
     * If the cart is empty, a message is displayed accordingly.
     */
    public void viewCart() {
        int count = 0;
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return; // Exit early if the cart is empty
        }
        System.out.println();
        System.out.println("Items in cart:");
        System.out.println("=======================================");
        for (Product p : items) {
            System.out.println(p.getProductId() + " " + p.getName() + " " + p.getPrice() + " ₹/- ");
            count++;
        }
        System.out.println("Total items: " + count);
    }

    /***
     * Returns the list of products currently in the shopping cart.
     *
     * @return A list of products in the cart.
     */
    public List<Product> getItems() {
        return items;
    }

    /***
     * Clears all items from the shopping cart.
     */
    public void clearCart() {
        items.clear();
    }

    /***
     * Calculates the total price of all items in the shopping cart.
     *
     * @return The total price of items in the cart.
     */
    public double calculateTotal() {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }
}
