package classesAndObjects.airplane;

public class Airplane {
    int flight_number;
    String destination;
    Float departure_time;

    public Airplane(int flight_number, String destination, Float departure_time) {
        this.flight_number = flight_number;
        this.destination = destination;
        this.departure_time = departure_time;
    }

    void checkFlightStatus(float time){
        if(time > departure_time) System.out.println("Your Flight is Delay");
        else System.out.println("Your Flight is On time");
    }

    public static void main(String[] args) {
        Airplane one = new Airplane(10,"London",9.11f);

        one.checkFlightStatus(8.10f);



    }


}
