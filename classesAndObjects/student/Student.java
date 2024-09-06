package classesAndObjects.student;

import java.util.ArrayList;

public class Student {
    String name;
    char grade;
    String course;

    public Student(String name, char grade, String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    ArrayList<String> student = new ArrayList<>();

    void addCourse(String course){
        student.add(course);
    }

    void removeCourse(String course){
        student.remove(course);
    }

    void displayCourse(){
        for(String st : student){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        Student st = new Student("Khan Abdullah",'B',"Btech");
        st.addCourse("Btech");
        st.addCourse("Bsc-IT");
        st.addCourse("Bsc-CS");
        st.addCourse("Bca");

        st.displayCourse();
        System.out.println();
        st.removeCourse("Bca");
        st.displayCourse();

    }
}
