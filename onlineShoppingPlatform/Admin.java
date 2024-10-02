package onlineShoppingPlatform;

/***
 * The Admin class represents the admin functionalities in the online shopping platform.
 * It allows the admin to manage the inventory by adding products to it.
 */
public class Admin {

    // The inventory that the admin will manage.
    private Inventory inventory;

    /***
     * Constructor for the Admin class.
     * Initializes the Admin with the specified inventory.
     *
     * @param inventory The inventory object that will be managed by the admin.
     */
    public Admin(Inventory inventory){
        this.inventory = inventory;
    }

    /***
     * This method allows the admin to add a product to the inventory.
     * It calls the addProduct method of the Inventory class to add the product.
     *
     * @param product The product to be added to the inventory.
     */
    public void addProductToInventory(Product product){
        inventory.addProduct(product);
        System.out.println("[Admin added product: " + product.getName() + " successfully.]");
    }
}
