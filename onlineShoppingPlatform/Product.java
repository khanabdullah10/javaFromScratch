package onlineShoppingPlatform;

/***
 * The Product class represents an item available for purchase in the online shopping platform.
 * It contains details such as type, name, price, product ID, and description of the product.
 */
public class Product {
    private String type;        // Type of the product (e.g., Electronic, Clothes)
    private String name;        // Name of the product
    private double price;       // Price of the product
    private String productId;   // Unique identifier for the product
    private String description;  // Description of the product

    /***
     * Constructs a new Product with the specified details.
     *
     * @param pType      The type of the product (e.g., Electronic, Clothes).
     * @param name       The name of the product.
     * @param price      The price of the product.
     * @param productId  The unique identifier for the product.
     * @param description A description of the product.
     */
    public Product(String pType, String name, double price, String productId, String description) {
        this.type = pType;
        this.name = name;
        this.price = price;
        this.productId = productId;
        this.description = description;
    }

    /***
     * Retrieves the name of the product.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /***
     * Retrieves the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /***
     * Retrieves the unique identifier for the product.
     *
     * @return The product ID.
     */
    public String getProductId() {
        return productId;
    }

    /***
     * Retrieves the type of the product.
     *
     * @return The type of the product.
     */
    public String getType() {
        return type;
    }

    /***
     * Returns a string representation of the product, including type, name, price, product ID, and description.
     *
     * @return A string that represents the product.
     */
    @Override
    public String toString() {
        return "Type: " + type + " " + name + " " + price + "₹/- " + productId + " " + description;
    }
}
