package classesAndObjects.dog;

class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom","Bulldog");
        System.out.println("Before updation :");
        System.out.println(dog.name);
        System.out.println(dog.breed);
        dog.setName("Boxo");
        dog.setBreed("Labrodog");
        System.out.println("\nAfter updation:");
        System.out.println(dog.name);
        System.out.println(dog.breed);
    }


}
