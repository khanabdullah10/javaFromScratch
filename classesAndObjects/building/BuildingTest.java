package classesAndObjects.building;



class Building {

    protected String address;

    protected int numberOfFloors;

    protected double totalArea;

    public Building(String address, int numberOfFloors, double totalArea) {

        this.address = address;

        this.numberOfFloors = numberOfFloors;

        this.totalArea = totalArea;

    }

    public void displayBuildingDetails() {

        System.out.println("Address: " + address);

        System.out.println("Number of Floors: " + numberOfFloors);

        System.out.println("Total Area: " + totalArea + " sq ft");

    }

}



class ResidentialBuilding extends Building {

    private int numberOfApartments;

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments) {

        super(address, numberOfFloors, totalArea);

        this.numberOfApartments = numberOfApartments;

    }

    public void displayResidentialDetails() {

        super.displayBuildingDetails();

        System.out.println("Number of Apartments: " + numberOfApartments);

    }

}



class CommercialBuilding extends Building {

    private double officeSpaceArea; // in square feet

    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpaceArea) {

        super(address, numberOfFloors, totalArea);

        this.officeSpaceArea = officeSpaceArea;

    }

    public void displayCommercialDetails() {

        super.displayBuildingDetails();

        System.out.println("Office Space Area: " + officeSpaceArea + " sq ft");

    }

}

public class BuildingTest {

    public static void main(String[] args) {



        ResidentialBuilding residentialBuilding = new ResidentialBuilding("123 Maple St", 10, 20000.0, 50);

        System.out.println("Residential Building Details:");

        residentialBuilding.displayResidentialDetails();



        CommercialBuilding commercialBuilding = new CommercialBuilding("456 Oak Ave", 20, 50000.0, 30000.0);

        System.out.println("\nCommercial Building Details:");

        commercialBuilding.displayCommercialDetails();

    }

}