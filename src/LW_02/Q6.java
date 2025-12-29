package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Q6 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String pattern = "d MMMM yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        String formattedDate = today.format(formatter);
        System.out.println("Today's date in the required format is:");
        System.out.println(formattedDate);
    }
}
