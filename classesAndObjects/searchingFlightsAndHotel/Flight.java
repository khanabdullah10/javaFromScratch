package classesAndObjects.searchingFlightsAndHotel;

import java.util.ArrayList;

public class Flight {

    public String name;

    public String destination;

    public ArrayList<Flight> flight_list = new ArrayList<>();

    public Flight(){

    }

    public Flight(String name,String destinantion ) {

        this.name = name;

        this.destination = destinantion;

    }

    public void adFlight(String name, String destination){

        Flight flight = new Flight(name,destination);

        flight_list.add(flight);

    }

    public void display(){

        System.out.print(flight_list);

    }

    @Override

    public String toString() {

        return "\n Flight :- " +

                "name : " + name + '\'' +

                ", destination : " + destination + '\'' ;

    }

    public void searchFlight(String name) {

        for (Flight fly : flight_list) {

            if (fly.name.equals(name)) {

                System.out.println("\nCongratulation your Flight name  (" + name + ") has been booked !");

                return;

            }

        }

        System.out.println("\nSorry, no Flight found with the name: " + name); // If no match is found

    }

    public void cancelFlight(String name) {

        for (Flight fly : flight_list) {

            if (fly.name.equals(name)) {

                System.out.println("\nYour Flight reservation (" + name + ") has been canceled successfully !");

                return;

            }

        }

        System.out.println("\nSorry, no Flight found with the name: " + name);

    }

}