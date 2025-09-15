package LW_01;

public class Q5 {
    public static class Circle {
        // Member variable for the radius of the circle
        private final double radius;

        // Constructor to initialize the Circle object
        public Circle(double radius) {
            this.radius = radius;
        }

        // Method to compute the area of a circle
        public double computeArea() {
            return Math.PI * radius * radius;
        }

        public static void main(String[] args) {
            // Given radii for the inner and outer circles
            double outerRadius = 10.0;
            double innerRadius = 5.0;

            // Create Circle objects for the inner and outer circles
            Circle outerCircle = new Circle(outerRadius);
            Circle innerCircle = new Circle(innerRadius);

            // Compute the areas of the outer and inner circles
            double outerArea = outerCircle.computeArea();
            double innerArea = innerCircle.computeArea();

            // Compute the area of the circular region (the shaded area)
            double shadedArea = outerArea - innerArea;

            // Print the results
            System.out.println("The area of the outer circle is: " + outerArea);
            System.out.println("The area of the inner circle is: " + innerArea);
            System.out.println("The area of the shaded region is: " + shadedArea);
        }
    }
}
