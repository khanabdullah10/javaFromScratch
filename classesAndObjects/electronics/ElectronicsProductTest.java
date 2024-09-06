package classesAndObjects.electronics;



class ElectronicsProduct {

    private String productID;

    private String name;

    private double price;

    public ElectronicsProduct(String productID, String name, double price) {

        this.productID = productID;

        this.name = name;

        this.price = price;

    }

    public void displayProductDetails() {

        System.out.println("Product ID: " + productID);

        System.out.println("Product Name: " + name);

        System.out.println("Price: $" + price);

    }



    public double calculateFinalPrice(double discountRate) {

        return price - (price * discountRate / 100);

    }

}



class WashingMachine extends ElectronicsProduct {

    private int warrantyPeriod;

    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {

        super(productID, name, price);

        this.warrantyPeriod = warrantyPeriod;

    }

    public void extendWarranty(int additionalYears) {

        warrantyPeriod += additionalYears;

        System.out.println("Warranty extended by " + additionalYears + " years. Total warranty: " + warrantyPeriod + " years.");

    }

    @Override

    public void displayProductDetails() {

        super.displayProductDetails();

        System.out.println("Warranty Period: " + warrantyPeriod + " years");

    }

}

public class ElectronicsProductTest {

    public static void main(String[] args) {



        ElectronicsProduct product1 = new ElectronicsProduct("EP001", "Smartphone", 599.99);

        System.out.println("Electronics Product Details:");

        product1.displayProductDetails();

        double finalPrice = product1.calculateFinalPrice(10); // Applying 10% discount

        System.out.println("Final Price after 10% discount: $" + finalPrice);



        WashingMachine washingMachine1 = new WashingMachine("WM001", "LG Washer", 799.99, 2);

        System.out.println("\nWashing Machine Details:");

        washingMachine1.displayProductDetails();

        washingMachine1.extendWarranty(1);

        finalPrice = washingMachine1.calculateFinalPrice(15);

        System.out.println("Final Price after 15% discount: $" + finalPrice);

    }

}