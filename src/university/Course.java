package university;

public class Course {
    private String name,enrollType;
    private int numberOfStuentsEnrolled;
    private Lecturer lecturerIncharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStuentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStuentsEnrolled = numberOfStuentsEnrolled;
    }


    public void displayInfo(){
        System.out.println("Course: " + name + " | Type: " + enrollType + " | Enrolled: " + numberOfStuentsEnrolled);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStuentsEnrolled() {
        return numberOfStuentsEnrolled;
    }

    public void setNumberOfStuentsEnrolled(int numberOfStuentsEnrolled) {
        this.numberOfStuentsEnrolled = numberOfStuentsEnrolled;
    }
    public void addLecturerInCharge(Lecturer l) { this.lecturerIncharge = l; }
    public void removeLecturerInCharge() { this.lecturerIncharge = null; }
    public void addDegreeBelongsTo(Degree d) { this.degreeBelongsTo = d; }
    public void removeDegreeBelongsTo() { this.degreeBelongsTo = null; }
}
