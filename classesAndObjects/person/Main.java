package classesAndObjects.person;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main{
    public static void main(String[] args) {
        Person one = new Person("khan Abdullah", 23);
        Person two = new Person("Ankit Singh", 21);

        System.out.println(one.name);
        System.out.println(one.age);
        System.out.println(two.name);
        System.out.println(two.age);
    }
}
