package onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;

/***
 * The Inventory class manages the collection of products in the online shopping platform.
 * It allows adding new products, searching for products by their ID, and displaying all available products.
 */
public class Inventory {

    // A HashMap to store products, where the key is the product ID and the value is the Product object.
    private HashMap<String, Product> products = new HashMap<>();

    /***
     * Adds a product to the inventory.
     * The product is stored in the HashMap with its product ID as the key.
     *
     * @param prod The product to be added to the inventory.
     */
    public void addProduct(Product prod) {
        products.put(prod.getProductId(), prod);
    }

    /***
     * Searches for a product in the inventory by its product ID.
     * If the product is not found, it throws a ProductNotFoundException.
     *
     * @param productId The ID of the product to be searched.
     * @return The Product object if found in the inventory.
     * @throws ProductNotFoundException If the product with the given ID is not found in the inventory.
     */
    public Product searchProduct(String productId) throws ProductNotFoundException {
        if (!products.containsKey(productId)) {
            throw new ProductNotFoundException("[Product with ID " + productId + " not found.]");
        }
        return products.get(productId);
    }

    /***
     * Displays all available products in the inventory.
     * If the inventory is empty, a message is displayed to inform that no products are available.
     */
    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println();
            System.out.println("Hey, there is no product available initially. Please wait for our Admins to add products to the inventory.");
        } else {
            System.out.println("Available Products:");
            System.out.println("============================================================================================");
            for (Product prod : products.values()) {
                System.out.println(prod);
            }
        }
    }
}
