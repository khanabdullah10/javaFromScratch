package classesAndObjects.employee;

public class Employee_9 {
String name;
int salary;
int hire_year;
int current_year = 2024;

    public Employee_9(String name, int salary, int hire_year) {
        this.name = name;
        this.salary = salary;
        this.hire_year = hire_year;
    }

    void yearOfService(int year){
        this.hire_year =year;
        int total = current_year-year;
        System.out.println("The Employee "+name +" has completed "+total+" Year of service in the complany.");

    }

    public static void main(String[] args) {
        Employee_9 em = new Employee_9("khan Abdullah",2400,2002);
        em.yearOfService(2002);
    }
}
