package test.question_2;

public class Tour {
    String tcode;
    int noofadults;
    int noofkids;
    int kilometer;
    float totalFare;

    public Tour() {
        this.tcode = null;
        this.noofadults = 0;
        this.noofkids = 0;
        this.kilometer = 0;
        this.totalFare = 0;
    }



    public void assignFare(){
        if(kilometer >= 1000) totalFare += (noofadults*500) + (noofkids*250);
        else if (kilometer <1000 && kilometer >= 500) totalFare += (noofadults*300)+(noofkids*150);
        else totalFare += (noofadults*200)+(noofkids*100);
    }

    public void enterTour(String tcode,int noofadults, int noofkids, int kilometer  ){

        this.tcode = tcode;
        this.noofadults = noofadults;
        this.noofkids = noofkids;
        this.kilometer = kilometer;

        assignFare();

    }

    public void showTour(){
        System.out.println("Tour :" +
                "tcode - " + tcode + '\'' +
                ", noofadults - " + noofadults +
                ", noofkids - " + noofkids +
                ", kilometer - " + kilometer +
                ", totalFare - " + totalFare );
    }

    public static void main(String[] args) {
        Tour tour = new Tour();
        tour.enterTour("ABC",10,5,2000);
        tour.showTour();
    }


}
