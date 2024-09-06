package classesAndObjects.school;

import java.util.*;

class School {

    private List<Student> students;

    private List<Teacher> teachers;

    private List<SchoolClass> classes;

    public School() {

        students = new ArrayList<>();

        teachers = new ArrayList<>();

        classes = new ArrayList<>();

    }

    // Method to add a student

    public void addStudent(Student student) {
       students.add(student);
        System.out.println("Added student: " + student.getName());

    }



    public void removeStudent(String name) {

        students.removeIf(student -> student.getName().equals(name));

        System.out.println("Removed student: " + name);

    }



    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);

        System.out.println("Added teacher: " + teacher.getName());

    }



    public void removeTeacher(String name) {

        teachers.removeIf(teacher -> teacher.getName().equals(name));

        System.out.println("Removed teacher: " + name);

    }



    public void createClass(SchoolClass schoolClass) {

        classes.add(schoolClass);

        System.out.println("Created class: " + schoolClass.getClassName());

    }



    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No students enrolled.");

        } else {

            System.out.println("Students:");

            students.forEach(System.out::println);

        }

    }



    public void displayTeachers() {

        if (teachers.isEmpty()) {

            System.out.println("No teachers employed.");

        } else {

            System.out.println("Teachers:");

            teachers.forEach(System.out::println);

        }

    }



    public void displayClasses() {

        if (classes.isEmpty()) {

            System.out.println("No classes available.");

        } else {

            System.out.println("Classes:");

            classes.forEach(System.out::println);

        }

    }

}

// Main class to test the functionality

public class Main {

    public static void main(String[] args) {

        School school = new School();



        Student student1 = new Student("Alice");

        Student student2 = new Student("Bob");



        Teacher teacher1 = new Teacher("Mr. Smith");

        Teacher teacher2 = new Teacher("Ms. Johnson");



        SchoolClass class1 = new SchoolClass("Mathematics");

        SchoolClass class2 = new SchoolClass("History");



        school.addStudent(student1);

        school.addStudent(student2);



        school.addTeacher(teacher1);

        school.addTeacher(teacher2);



        school.createClass(class1);

        school.createClass(class2);



        System.out.println("\nList of Students:");

        school.displayStudents();



        System.out.println("\nList of Teachers:");

        school.displayTeachers();



        System.out.println("\nList of Classes:");

        school.displayClasses();



        school.removeStudent("Bob");

        school.removeTeacher("Ms. Johnson");



        System.out.println("\nUpdated List of Students:");

        school.displayStudents();

        System.out.println("\nUpdated List of Teachers:");

        school.displayTeachers();

    }

}
