package classesAndObjects.employee;
class Employee{
    String name;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double newSalary){
        this.salary += newSalary;

    }

    void display(){

        System.out.println("Name : "+ name);
        System.out.println("Job profile "+ jobTitle);
        System.out.println("Current Salary : "+salary);
    }


}
public class Question_6 {
    public static void main(String[] args) {
        Employee emp = new Employee("Khan Abdullah","Data Analyst",47000.32d);
        Employee emp2 = new Employee("Ankit Singh","Angular developer",33000.14d);
        System.out.println("Initail salary :");
        emp.display();
        System.out.println();

        emp2.display();
        System.out.println();

        emp.updateSalary(80000);
        emp2.updateSalary(72000);

        System.out.println("Salary after updation :");

        emp.display();
        System.out.println();
        emp2.display();





    }
}
