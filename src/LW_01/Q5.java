package LW_01;

import java.util.*;
public class Q5 {

    public static class Circle{
        public static final double pi = 3.14;
        private double radius;
        public Circle(double r){
            this.radius = r;
        }
        public void setRadius(double r){
            if(r > 0){
                this.radius = r;
            } else {
                System.out.println("radius caan not be include nagative values");
                this.radius = 0;
            }
        }
        public double getRadius(){
            return this.radius;
        }
        public double computeArea(){
            double area = pi * this.radius * this.radius;
            return area;
        }
        public double computeCircumference(){
            double circumference = 2 * pi * this.radius;
            return circumference;
        }

        public static void main(String[] args) {
            double rI,rO;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter inner circle radius:-");
            rI = scanner.nextDouble();
            System.out.print("Enter outer circle radius:-");
            rO = scanner.nextDouble();
            Circle circle = new Circle(rI);
            Circle circle1 = new Circle(rO);

            double area = circle.computeArea();
            double area1 = circle1.computeArea();
            area = area1 - area;
            double cirumference = circle.computeCircumference();
            System.out.println("area is:- " +  area);
            System.out.println("curcoference is:- " + cirumference );

   scanner.close();

        }
    }
}
