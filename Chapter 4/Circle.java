public class Circle {

    // Circle class definition
    public static class Circle {
        public double radius;
        public double diameter;
        public double area;

        // Constructor
        public Circle() {
            setRadius(1); // Initialize with radius 1
        }

        // Method to set the radius, update diameter and area
        public void setRadius(double rad) {
            radius = rad;
            diameter = 2 * radius;
            area = Math.PI * radius * radius; // Use Math.PI for precision
        }

        // Getter for radius
        public double getRadius() {
            return radius;
        }

        // Getter for diameter
        public double getDiameter() {
            return diameter;
        }

        // Getter for area
        public double getArea() {
            return area;
        }
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle a = new Circle(); // Create first Circle object
        a.setRadius(3); // Set radius for Circle a

        // Print details of Circle a
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

        Circle b = new Circle(); // Create second Circle object
        b.setRadius(20); // Set radius for Circle b

        // Print details of Circle b
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}
