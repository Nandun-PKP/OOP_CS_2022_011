package LW_01;

public class Q3 {
    public static void main(String[] args) {
        int cm = 250;
        double in = cm / 2.54;
        int feet = (int)in/12;
        double inch = in - feet * 12;
        System.out.println("feet:" + feet + "  inch:" + inch);

    }
}
