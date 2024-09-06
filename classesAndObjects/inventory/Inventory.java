package classesAndObjects.inventory;

import java.util.ArrayList;

public class Inventory {
    String product;
    int max = 5;

    static ArrayList<Inventory> prod;

    public Inventory(String product) {
        this.product = product;
    }



    void adProduct(Inventory items){
        prod.add(items);
    }

    void reMove(Inventory items){
        prod.removeIf(inventory -> inventory.toString().contains(items.toString()));
    }

    void checkForLowInventory(){
        for(int i = 0 ; i < prod.size() ; i++){
            if(i < max) System.out.println("The Inventory is Low");
            else System.out.println("The Inventory is Full");
            break;


        }

    }

    public String toString(){
        return product;
    }




    public static void main(String[] args) {

       prod = new ArrayList<>();

        Inventory item1 = new Inventory("Milk");
        Inventory item2 = new Inventory("Bread");
        Inventory item3 = new Inventory("Butter");
        Inventory item4 = new Inventory("Honey");
        Inventory item5 = new Inventory("Sugar");
        Inventory item6 = new Inventory("Flour");

        item1.adProduct(item1);
        item2.adProduct(item2);
        item3.adProduct(item3);
        item4.adProduct(item4);
        item5.adProduct(item5);
        item6.adProduct(item6);



        for (Inventory item : prod){
            System.out.println(item);
        }

        item1.reMove(item5);
        System.out.println();

        for (Inventory item : prod){
            System.out.println(item);
        }
        System.out.println();

//        item1.checkForLowInventory();


    }


}
