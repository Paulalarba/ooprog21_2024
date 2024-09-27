public class Circle {
    
    public static class testCircle {
        public double radius;
        public double diameter;
        public double area;

        //Constructure
        public testCircle() {
            setRadius(1);         }
        
        // Method to set the radius, update diameter and area
        public void setRadius(double rad) {
            radius = rad;
            diameter = 2 * radius;
            area = Math.PI * radius * radius;         }

        
        public double getRadius() {
            return radius;
        }
        
        public double getDiameter() {
            return diameter;
        }

       
        public double getArea() {
            return area;
        }
    }
    
    public static void main(String[] args) {
        testCircle a = new testCircle();
        a.setRadius(3); 

        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

        testCircle b = new testCircle(); 
        b.setRadius(20);

        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}
