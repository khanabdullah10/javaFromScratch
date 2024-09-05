package test.question_3;

import java.util.ArrayList;

public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee(){

    }

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }





    void display(){

        System.out.println(name + "          "+ yearOfJoining +"                 "+address);
        System.out.println();

    }

    public static void main(String[] args) {

        Employee em = new Employee();
        Employee em1 = new Employee("Rahul",1994 ,1000,"Tilak Nagar, New Delhi");
        Employee em2 = new Employee("Roman",2000 ,1000,"Hari Nagar, New Delhi");
        Employee em3 = new Employee("Rahul",1999 ,1000,"Subash Nagar Nagar, New Delhi");



        System.out.println("Name    "+" Years of Joining             "+"Adress  " );
        em1.display();
        em1.display();
        em1.display();



    }
}
