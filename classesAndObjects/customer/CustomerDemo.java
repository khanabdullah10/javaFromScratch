package classesAndObjects.customer;

class Customer {

    private String name;

    private String contactInfo;

    private double totalExpenditure;

    public Customer(String name, String contactInfo, double totalExpenditure) {

        this.name = name;

        this.contactInfo = contactInfo;

        this.totalExpenditure = totalExpenditure;

    }

    public void displayDetails() {

        System.out.println("Name: " + name + ", Contact: " + contactInfo + ", Expenditure: $" + totalExpenditure);

    }

}

class LoyalCustomer extends Customer {

    private double discountRate;

    public LoyalCustomer(String name, String contactInfo, double totalExpenditure, double discountRate) {

        super(name, contactInfo, totalExpenditure);

        this.discountRate = discountRate;

    }

    public void applyDiscount() {

        System.out.println("Discount applied: " + discountRate + "%");

    }

}

public class CustomerDemo {

    public static void main(String[] args) {



        Customer customer1 = new Customer("John Doe", "john.doe@example.com", 1500.0);

        System.out.println("Regular Customer Details:");

        customer1.displayDetails();



        LoyalCustomer loyalCustomer1 = new LoyalCustomer("Jane Smith", "jane.smith@example.com", 3000.0, 10.0);

        System.out.println("\nLoyal Customer Details:");

        loyalCustomer1.displayDetails();

        loyalCustomer1.applyDiscount();

    }

}