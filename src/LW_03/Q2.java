package LW_03;
import java.util.*;
public class Q2 {
    public static class Temperature {
     private double fahrenheit;
     public Temperature(double fahrenheit){
         this.fahrenheit = fahrenheit;
     }
        public void setFahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
        }
        public double toCelsius(){
          return  (fahrenheit - 32) * 5 / 9;
        }
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fahrenheit = ");
        double f = scanner.nextDouble();
        Temperature temp = new Temperature(f);
        double c = temp.toCelsius();
        String formattedValue = String.format("%.2f", c);
        System.out.println("This is Fahrenheit = " + f);
        System.out.println("This is celsius = " + formattedValue);

    }
}
