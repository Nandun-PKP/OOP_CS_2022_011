package LW_01;
import javax.swing.JFrame; // JFrame පන්තිය ආනයනය කරන්න
import java.awt.*;

public class Q4 {



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My First Frame");

        // රාමුවේ ප්‍රමාණය (පළල, උස) පික්සල වලින් සකසන්න
        frame.setSize(300,200);

        // රාමුවේ ඉහළ-වම් කෙළවරෙහි ස්ථානය තිරය මත සකසන්න
        frame.setLocation(100, 50);


        frame.getContentPane().setBackground(Color.GREEN);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
