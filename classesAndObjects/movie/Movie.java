package classesAndObjects.movie;


public class Movie {

    private String title;

    private String director;

    private String actor;

    private double reviews;

    public Movie(String title, String director, String actor, double reviews) {

        this.title = title;

        this.director = director;

        this.actor = actor;

        this.reviews = reviews;

    }

    public double getReviews() {

        return reviews;

    }

    public void addReviews(double reviews) {

        this.reviews = reviews;

    }

    public void display(){

        System.out.println("Movie {" +

                "title :'" + title + '\'' +

                ", director :'" + director + '\'' +

                ", actor :'" + actor + '\'' +

                ", reviews :" + reviews +

                '}');

    }

    public static void main(String[] args) {

        Movie movie = new Movie("Ek tha tiger","Kabir khan","Salman khan",4.5);

        movie.display();

        System.out.println("Reviews :"+ movie.getReviews());

        System.out.println();

        movie.addReviews(7.8);

        movie.display();

        System.out.println("Reviews :"+ movie.getReviews());



    }

}
