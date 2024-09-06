package classesAndObjects.customerOrder;

class CustomerOrder {

    String orderID;

    String customer;

    String orderDate;

    public CustomerOrder(String orderID, String customer, String orderDate) {

        this.orderID = orderID;

        this.customer = customer;

        this.orderDate = orderDate;

    }

    public void displayOrderDetails() {

        System.out.println("Order ID: " + orderID);

        System.out.println("Customer: " + customer);

        System.out.println("Order Date: " + orderDate);

    }

}

class OnlineOrder extends CustomerOrder {

    String deliveryAddress;

    String trackingNumber;

    String trackingStatus;

    public OnlineOrder(String orderID, String customer, String orderDate, String deliveryAddress, String trackingNumber) {

        super(orderID, customer, orderDate);

        this.deliveryAddress = deliveryAddress;

        this.trackingNumber = trackingNumber;

        this.trackingStatus = "Pending";

    }

    public void displayOrderDetails() {

        super.displayOrderDetails(); // Call base class method

        System.out.println("Delivery Address: " + deliveryAddress);

        System.out.println("Tracking Number: " + trackingNumber);

        System.out.println("Tracking Status: " + trackingStatus);

    }

    public int calculateDeliveryTime() {

        int deliveryDays = deliveryAddress.length() % 3 + 1;

        System.out.println("Estimated Delivery Time: " + deliveryDays + " days");

        return deliveryDays;

    }

    public void updateTrackingStatus(String newStatus) {

        this.trackingStatus = newStatus;

        System.out.println("Tracking status updated to: " + trackingStatus);

    }

}

public class CustomerOrderTest {

    public static void main(String[] args) {

        CustomerOrder order1 = new CustomerOrder("ORD001", "John Doe", "2024-08-27");

        System.out.println("Customer Order Details:");

        order1.displayOrderDetails();

        OnlineOrder onlineOrder1 = new OnlineOrder("ORD002", "Jane Smith", "2024-08-27", "123 Elm St, Springfield", "TRACK12345");

        System.out.println("\nOnline Order Details:");

        onlineOrder1.displayOrderDetails();

        onlineOrder1.calculateDeliveryTime();

        onlineOrder1.updateTrackingStatus("Shipped");

        System.out.println("\nUpdated Online Order Details:");

        onlineOrder1.displayOrderDetails();

    }

}