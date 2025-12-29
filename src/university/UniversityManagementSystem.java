package university;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department department = new Department("SoftwareEngineering");
        Degree degree = new Degree("computerSience",100);
        Course oop = new Course("OOP");
        Lecturer lecturer = new Lecturer("sugath");
        Student student  = new Student("kamal");

        dept.appointDepartmentHead(lecturer);
        dept.addLecturer(lecturer);
        dept.offerCourse(course);

        degree.offerCourse(course);

        course.addLecturerInCharge(lecturer);
        course.addDegreeBelongsTo(degree);

        lecturer.addCourse(course);
        student.enrollCourse(course);

        System.out.println("--- University Management System ---");
        department.displayInfoDepartment();
        degree.displayInfo();
        oop.displayInfo();
        lecturer.displayDepartmentInfo();
        student.displayDegreeInfo();

        System.out.println();
        lecturer.listCoursesTeaching();
        student.listCoursesEnrolled();
    }

}
