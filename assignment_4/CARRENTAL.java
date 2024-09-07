package assignment_4;
import java.sql.SQLOutput;
import java.util.*;

public class CARRENTAL {
    Scanner sc = new Scanner(System.in);
    private int carId;
    private String carType;
    private float rent;

    public void getCar() {
        System.out.print("---:Enter car details as follows:---\n");
        System.out.print("Car Id : ");
        this.carId = sc.nextInt();
        System.out.println();
        System.out.print("Car Type : ");
        this.carType = sc.next();

        System.out.println("\n________________________________________");
        System.out.printf("\n Car Id : %d \n Car Type : %s",carId,carType);

    }

    public void getRent() {
        if(this.carType.equals("small")) {
            this.rent = 1000;
        }
        else if(this.carType.equals("Van")) {
            this.rent = 800;
        }
        else this.rent = 2500;
    }

    public void showCar(){
        System.out.println("Car details are as follows :");
        System.out.println("---------------------------------------------------------");
        System.out.println("Car Id : "+carId);
        System.out.println("Car Type : "+carType);
        System.out.println("Car Rent : "+rent);
    }


    public static void main(String[] args) {
        CARRENTAL car = new CARRENTAL();
        car.getCar();
        car.getRent();
        car.showCar();
    }

}
