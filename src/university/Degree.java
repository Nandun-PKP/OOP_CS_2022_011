package university;
import java.util.*;

public class Degree {
    private String name;
    private int numberOfStudent;
    private final ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudent) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.numberOfStudent = numberOfStudent;
    }


    public void displayInfo() {
        System.out.println("Degree: " + name + " | Students: " + numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }


    public void offerCourse(Course course) { coursesOffering.add(course); }
    public void withdrawCourse(Course course) { coursesOffering.remove(course); }

    public void listCoursesOffering() {
        System.out.println("Courses under " + name + ":");
        for (Course c : coursesOffering) System.out.println("- " + c.getName());
    }
}
