package classesAndObjects.school;

public class SchoolClass {
    private String className;

    public SchoolClass(String className) {

        this.className = className;

    }

    public String getClassName() {

        return className;

    }

    @Override

    public String toString() {

        return "Class: " + className;

    }
}
