package classesAndObjects.vehicle;



class Vehicle {

    private String make;

    private String model;

    private int year;

    public Vehicle(String make, String model, int year) {

        this.make = make;

        this.model = model;

        this.year = year;

    }

    // Getters

    public String getMake() {

        return make;

    }

    public String getModel() {

        return model;

    }

    public int getYear() {

        return year;

    }

}

class Car extends Vehicle {

    private int trunkSize;

    public Car(String make, String model, int year, int trunkSize) {

        super(make, model, year);

        this.trunkSize = trunkSize;

    }

    public int getTrunkSize() {

        return trunkSize;

    }

}

class Truck extends Vehicle {

    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {

        super(make, model, year);

        this.payloadCapacity = payloadCapacity;

    }

    public int getPayloadCapacity() {

        return payloadCapacity;

    }

}

public class VehicleDemo {

    public static void main(String[] args) {

        // Creating a Car object

        Car car = new Car("Toyota", "Camry", 2021, 500);

        System.out.println("Car Details:");

        System.out.println("Make: " + car.getMake());

        System.out.println("Model: " + car.getModel());

        System.out.println("Year: " + car.getYear());

        System.out.println("Trunk Size: " + car.getTrunkSize() + " liters");

        // Creating a Truck object

        Truck truck = new Truck("Ford", "F-150", 2022, 1000);

        System.out.println("\nTruck Details:");

        System.out.println("Make: " + truck.getMake());

        System.out.println("Model: " + truck.getModel());

        System.out.println("Year: " + truck.getYear());

        System.out.println("Payload Capacity: " + truck.getPayloadCapacity() + " kg");

    }

}
