package classesAndObjects.searchingFlightsAndHotel;

public class Main {

    public static void main(String[] args) {

//        Hotel hotel = new Hotel();

//

//        hotel.adHotel("Taj hotel","Bombay");

//        hotel.adHotel("Grand hayat","Delhi");

//        hotel.adHotel("Royal inn","Pune");

//

//        hotel.display();

//        System.out.println();

//

//        hotel.searchHotel("Royal inn");

//        hotel.cancelHotel("Royal inn");

        Flight flight = new Flight();

        flight.adFlight("Vistara","Mumbai");

        flight.adFlight("King Fisher","Delhi");

        flight.adFlight("Indigo","Pune");

        flight.adFlight("Spice Jet","Hyderabad");

        flight.display();

        System.out.println();

        flight.searchFlight("Indigo");

        flight.cancelFlight("Indigo");

    }

}