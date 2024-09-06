package classesAndObjects.searchingFlightsAndHotel;

import java.util.ArrayList;

class Hotel {

    public String name;

    public String locality;

    public ArrayList<Hotel> hotellist = new ArrayList<>();

    public Hotel(){

    }

    public Hotel(String name,String locality ) {

        this.name = name;

        this.locality = locality;

    }

    public void adHotel(String name, String locality){

        Hotel hotel = new Hotel(name,locality);

        hotellist.add(hotel);

    }

    public void display(){

        System.out.print(hotellist);

    }

    @Override

    public String toString() {

        return "\n"+" Hotel :-" +

                "name : " + name + '\'' +

                ", locality : " + locality + '\'' ;

    }

    public void searchHotel(String name) {

        for (Hotel hotel : hotellist) {

            if (hotel.name.equals(name)) {

                System.out.println("\nCongratulation your hotel (" + name + ") has been booked !");

                return;

            }

        }

        System.out.println("\nSorry, no hotel found with the name: " + name); // If no match is found

    }

    public void cancelHotel(String name) {

        for (Hotel hotel : hotellist) {

            if (hotel.name.equals(name)) {

                System.out.println("\nYour hotel reservation (" + name + ") has been canceled successfully !");

                return;

            }

        }

        System.out.println("\nSorry, no hotel found with the name: " + name);

    }

}