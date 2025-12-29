package LW_03;

public class Q4 {
    public static class Course{
        private String courseName;
        private String courseCode;

        public Course(String courseName,String courseCode){
            this.courseCode = courseCode;
            this.courseName = courseName;

        }
        public String getCourseName() {
            return courseName;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

    }
    public static class Lecturer{
        private String lecturerName;
        private String courseTeaching;

        public Lecturer(String lecturerName,String courseTeaching){
            this.courseTeaching = courseTeaching;
            this.lecturerName = lecturerName;
        }
        public String getLecturerName() {
            return lecturerName;
        }

        public String getCourseTeaching() {
            return courseTeaching;
        }

        public void setLecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
        }

        public void setCourseTeaching(String courseTeaching) {
            this.courseTeaching = courseTeaching;
        }


    }
    public static class Student{
        private String studentName;
        private String degreeName;
        private String courseFollowing;

        public Student(String studentName,String degreeName,String courseFollowing){
            this.courseFollowing = courseFollowing;
            this.degreeName = degreeName;
            this.studentName = studentName;
        }
        public String getStudentName() {
            return studentName;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public String getCourseFollowing() {
            return courseFollowing;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public void setCourseFollowing(String courseFollowing) {
            this.courseFollowing = courseFollowing;
        }
    }

    public static void main(String[] args) {
        Lecturer lec = new Lecturer("profmalinth","oop");
        Course cos = new Course("oop fundamental","1212");
        Student stu =  new Student("sumat","cs","jksk");

        System.out.println("Course"  + cos.getCourseName() + cos.getCourseCode());
        System.out.println("Lecture" + lec.getCourseTeaching() + lec.getLecturerName());
        System.out.println("Student" +  stu.getStudentName() + stu.getDegreeName() + stu.getCourseFollowing() );

    }
}
