package university;

import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName() + " | Position: " + position);
    }
    public void displayDepartmentInfo() {
        if (department != null) department.displayInfo();
    }
    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}
    public void setDepartment(String department) {this.department = department;}

    public void addCourse(){
        coursesTeaching.add(Course);
    }
    public void removeCourse(){
        coursesTeaching.remove(Course);
    }
    public void listCoursesTeaching() {
        System.out.println("Courses Teaching by " + getName() + ":");
        for (Course c : coursesTeaching) System.out.println("- " + c.getName());
    }


}
