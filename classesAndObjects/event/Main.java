package classesAndObjects.event;

import java.util.ArrayList;

class Event {
    String name;
    String date;
    String location;

    public Event(){

    }

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void  displayInfo(){
        System.out.println("Event name : "+ name +" ,Event date : "+", Location "+ location );
    }

}class Seminar extends Event{
    int speakers;

    public Seminar(){

    }

    public Seminar(String name, String date, String location, int speakers) {
        super(name, date, location);
        this.speakers = speakers;
    }
    void displaySpeakers(){
        System.out.println("Number of Speaker : "+speakers);
    }

    void addEvent(String name, String date, String location, int speakers){
        this.name = name;
        this.date = date;
        this.location = location;
        this.speakers = speakers;
    }
}class MusicalPerformance extends Event{

    ArrayList<String>  list_of_performer  = new ArrayList<>();;

    public MusicalPerformance(){

    }

    public MusicalPerformance(String performer){
        list_of_performer.add(performer.toString());

    }

    public void addPerformer(MusicalPerformance performer){
        list_of_performer.add(performer.toString());
    }

    void displayPerformers(){
        System.out.println(list_of_performer);
    }

    @Override
    public String toString() {
        return  " Performer :" + list_of_performer ;

    }
}
public class Main{
    public static void main(String[] args) {

        Seminar sem = new Seminar();
        sem.addEvent("Ocean Band","28-08-2024","Mumbai",4);
        sem.displayInfo();
        sem.displaySpeakers();
        Seminar sem1 = new Seminar();
        sem1.addEvent("Rock on","28-08-2024","Mumbai",4);
        System.out.println();
           MusicalPerformance performer = new  MusicalPerformance();
           MusicalPerformance shaan = new  MusicalPerformance("shaan");
           MusicalPerformance Arijit = new  MusicalPerformance("Arijit singh");
           MusicalPerformance Atif = new  MusicalPerformance("Atif aslam");


        performer.addPerformer(shaan);
        performer.addPerformer(Arijit);
        performer.addPerformer(Atif);

        if(sem.date == sem1.date){
            System.out.println("\n As the date of the event are same the event will clash !");
        }else System.out.println("\n No conflict od event !");

        performer.displayPerformers();



    }

}
