package onlineShoppingPlatform;

import src.onlineShoppingPlatform.customException.PaymentFailedException;

/***
 * The Payment class handles the payment processing for orders in the online shopping platform.
 * It supports various payment methods and ensures that the payment is accepted before proceeding.
 */
public class Payment {

    /***
     * Processes the payment based on the given payment method and amount.
     * Supports payment methods like Credit Card, Debit Card, COD, and UPI.
     * Throws a PaymentFailedException if an unsupported payment method is provided.
     *
     * @param paymentMethod The method of payment chosen by the customer (e.g., Credit Card, Debit Card, COD, UPI).
     * @param amount The total amount to be processed for the order.
     * @throws PaymentFailedException if the payment method is not supported.
     */
    public static void processPayment(String paymentMethod, double amount) throws PaymentFailedException {
        // Handle payment processing based on accepted payment methods
        if(paymentMethod.equalsIgnoreCase("credit card") || paymentMethod.equalsIgnoreCase("Debit card")) {
            System.out.println("Processing " + paymentMethod + " payment of - ₹ " + amount);
        } else if(paymentMethod.equalsIgnoreCase("COD") || paymentMethod.equalsIgnoreCase("UPI")) {
            System.out.println("Processing " + paymentMethod + " payment of - ₹ " + amount);
        } else {
            // Throw exception if payment method is not recognized
            throw new PaymentFailedException("Payment method not accepted");
        }
    }
}
