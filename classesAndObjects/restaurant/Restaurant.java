package classesAndObjects.restaurant;

import java.util.ArrayList;
class MenuItem{

    String name;
    double price;
    double rating;

    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MenuItem { " +
                "name =' " + name + '\'' +
                ", price = " + price +
                ", rating  = " + rating +
                '}';
    }
}
public class Restaurant {

    private ArrayList<MenuItem> menu;
    public Restaurant(){
        this.menu = new ArrayList<>();
    }




    public void addItems(String name, double price, double rating){
        MenuItem item = new MenuItem(name,price,rating);
        menu.add(item);
    }

    public void removeItems(String name ){
        menu.removeIf(item -> item.name.equals(name));
    }



   public void calculateAverage(){
        if (menu.isEmpty()) System.out.println("Menu is empty");
        else {
            double total_rating = 0;

            for (MenuItem item : menu){
                total_rating += (item.rating/3);

            }

            System.out.println(total_rating);

        }
   }

    public void displayItems(){
        System.out.println("\n"+menu);
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItems("Burger",50.0,4.2);
        restaurant.addItems("Pizza",80.0,4.9);
        restaurant.addItems("Sandwitch",40.0,4.3);

        restaurant.displayItems();

        System.out.println("\n Calculating average ratings : ");
        restaurant.calculateAverage();





    }

}
