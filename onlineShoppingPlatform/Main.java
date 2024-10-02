package onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.OutOfStockException;
import src.onlineShoppingPlatform.customException.PaymentFailedException;
import src.onlineShoppingPlatform.customException.ProductNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    /***
     * The main method serves as the entry point for the Online Shopping Platform application.
     * It allows two types of users to interact with the system: Admin and Customer.
     * @throws PaymentFailedException if the payment process encounters an error.
     * @throws IOException for input/output errors.
     * @throws ProductNotFoundException if the product being searched is not found.
     * @throws OutOfStockException if the product being added to the cart is out of stock.
     ***/
    public static void main(String[] args) throws PaymentFailedException, IOException, ProductNotFoundException, OutOfStockException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Admin admin = new Admin(inventory);
        boolean exit = false;

        // Simple Login System
        System.out.println("Welcome to the Online Shopping Platform!");
        System.out.println("Please log in:");
        System.out.println("Press <1> for Admin Login");
        System.out.println("Press <2> for Customer Login");

        int userType = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (userType == 1) {
            // Admin Section
            System.out.println("Hello Admin, please authenticate:");
            System.out.print("Enter Admin username: ");
            String username = br.readLine();
            System.out.print("Enter Admin password: ");
            String password = br.readLine();

            if (username.equals("admin") && password.equals("admin123")) {
                System.out.println("Login successful! Welcome, Admin.");

                // Admin operations
                while (!exit) {
                    System.out.println();
                    System.out.println("***************************######################################***********************");
                    System.out.println("Hello Admin! Please add product to keep stock in our Inventory");
                    System.out.println();
                    System.out.println("Choose Item type:");
                    System.out.println("Press <1> - Electronic");
                    System.out.println("Press <2> - Clothes");
                    System.out.println("Press <3> - House Decor or Kitchen utensils");
                    System.out.println("Press <4> - Food");
                    System.out.println("Press <5> - Done adding products and move to customer section");
                    System.out.println();
                    System.out.print("Enter option: ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    String pName = null;
                    float pPrice = 0.0f;
                    String pId = null;
                    String pDescription = null;

                    switch (choice) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Enter Product name: ");
                            pName = br.readLine();
                            System.out.println("Enter Product price: ");
                            pPrice = Float.parseFloat(br.readLine());
                            System.out.println("Enter Product Id: ");
                            pId = br.readLine();
                            System.out.println("Enter description for the product: ");
                            pDescription = br.readLine();

                            String category = "";
                            switch (choice) {
                                case 1 -> category = "Electronic";
                                case 2 -> category = "Clothes";
                                case 3 -> category = "House Decor Or Home Utensils";
                                case 4 -> category = "Food";
                            }

                            admin.addProductToInventory(new Product(category, pName, pPrice, pId, pDescription));

                            System.out.println("Product added successfully!");
                            System.out.println("Do you want to add more? Continue by pressing (+) or move to Customer by pressing (.)");
                            String input = br.readLine();
                            if (input.equalsIgnoreCase("+")) {
                                continue;
                            } else if (input.equalsIgnoreCase(".")) {
                                break; // Exit the admin loop and proceed to customer section
                            }

                        case 5:
                            System.out.println("Admin finished adding products. Moving to Customer section...");
                            exit = true; // Exit the admin loop
                            break;

                        default:
                            System.out.println("Invalid input by the Admin");
                    }
                }

                // Reset the flag for the customer section
                exit = false;
            } else {
                System.out.println("Invalid credentials, exiting the system.");
                System.exit(0);
            }

        }

        // Move to Customer Section after Admin is done
        System.out.println("Welcome, Customer!");
        System.out.println("Enter your name:");
        String cName = br.readLine();
        Customer customer = new Customer(cName);

        // Customer operations
        while (!exit) {
            inventory.showAllProducts();
            System.out.println();
            System.out.println("Enter the product ID to add to cart (<or 'done' to checkout>):");
            String productId = br.readLine();

            if (productId.equalsIgnoreCase("done")) {
                customer.get().viewCart();
                Order order = new Order(customer);
                order.placeOrder();

                System.out.println();
                System.out.println("Enter payment method:");
                String method = br.readLine();

                System.out.println("Your total amount = " + customer.get().calculateTotal());
                Payment.processPayment(method, customer.get().calculateTotal());
                Shipping.trackOrder();
                exit = true; // End the loop after placing order and payment
            } else {
                try {
                    Product product = inventory.searchProduct(productId);
                    customer.get().addItem(product);
                } catch (ProductNotFoundException | OutOfStockException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        System.out.println("Thank you for using our platform. Goodbye!");
    }
}
