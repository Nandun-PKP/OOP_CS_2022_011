package LW_03;
import  java.util.*;
public class Q1 {
     public static class Temperature {
         private double celsius;

         public Temperature() {
             this.celsius = 0.0;
         }

         public Temperature(double celsius) {
             this.celsius = celsius;
         }

         public void setCelsius(double celsius) {
             this.celsius = celsius;
         }

         public void setFahrenheit(double fahrenheit) {
             this.celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
         }

         public double toCelsius() {
             return this.celsius;
         }

         public double toFahrenheit() {
             return (this.celsius * 9.0 / 5.0) + 32.0;
         }
     }
         public static void main(String[] args) {
             double  c;
             System.out.println("//**This is celsius to fahrenheit**\\");
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter temperature =");
             c = scanner.nextDouble();
             Temperature temp = new Temperature(c);
             double f = temp.toFahrenheit();
             System.out.println("The temperature in Celcius is: " + c);
             System.out.print("The temperature in Fahrenheit is: " + f);
             scanner.close();
         }

     }

