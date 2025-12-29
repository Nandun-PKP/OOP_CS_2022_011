package university;
import  java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    private String year;
    private Degree degree;
    private final ArrayList<Course> coursesEnrolled ;

    public Student(String name, int studentId, Degree degree, String year) {
        super(name);
        this.studentId = studentId;
        this.degree = degree;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }


    @Override
    public void displayInfo() {
        System.out.println("Student id is: " + studentId + "year is:" + year + "Degree is:" + degree );
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public void registerDegree(Degree degree) { this.degree = degree; }
    public void displayDegreeInfo() { if (degree != null) degree.displayInfo(); }

    public void enrollCourse(Course course) { coursesEnrolled.add(course); }
    public void unenrollCourse(Course course) { coursesEnrolled.remove(course); }
    public void listCoursesEnrolled(){
        System.out.println("Courses Enrolled by " + getName() + ":");
        for (Course c : coursesEnrolled) System.out.println("- " + c.getName());
    }

}
