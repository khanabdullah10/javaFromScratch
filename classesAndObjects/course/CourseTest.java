package classesAndObjects.course;



class Course {

    private String courseName;

    private String instructor;

    private int credits;

    public Course(String courseName, String instructor, int credits) {

        this.courseName = courseName;

        this.instructor = instructor;

        this.credits = credits;

    }

    public void displayCourseDetails() {

        System.out.println("Course Name: " + courseName);

        System.out.println("Instructor: " + instructor);

        System.out.println("Credits: " + credits);

    }

}



class OnlineCourse extends Course {

    private String platform;

    private int duration;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {

        super(courseName, instructor, credits);

        this.platform = platform;

        this.duration = duration;

    }

    public void displayCourseDetails() {

        super.displayCourseDetails();

        System.out.println("Platform: " + platform);

        System.out.println("Duration: " + duration + " weeks");

    }

    public boolean isEligibleForCertificate() {

        return duration >= 4; //

    }

}

public class CourseTest {

    public static void main(String[] args) {



        Course course1 = new Course("Data Structures", "Dr. Smith", 3);

        System.out.println("Course Details:");

        course1.displayCourseDetails();



        OnlineCourse onlineCourse1 = new OnlineCourse("Java Programming", "Prof. Johnson", 4, "Coursera", 6);

        System.out.println("\nOnline Course Details:");

        onlineCourse1.displayCourseDetails();

        if (onlineCourse1.isEligibleForCertificate()) {

            System.out.println("This course is eligible for a certificate.");

        } else {

            System.out.println("This course is not eligible for a certificate.");

        }

    }

}