public class MathTest {
    public static void main(String[] args) {
        // Square root of 37
        System.out.println("SQRT: " + Math.sqrt(37));

        // Sine and cosine of 300 degrees
        double radians = Math.toRadians(300);
        System.out.println("SIN: " + Math.sin(radians));
        System.out.println("COS: " + Math.cos(radians));

        // Floor, ceiling, and round of 22.8
        double value = 22.8;
        System.out.println("FLOOR: " + Math.floor(value));
        System.out.println("CEIL: " + Math.ceil(value));
        System.out.println("ROUND: " + Math.round(value));

        // Larger and smaller of 'D' (ASCII 68) and 71
        System.out.println("MAX: " + Math.max('D', 71));
        System.out.println("MIN: " + Math.min('D', 71));

        // Random number between 0 and 100
        System.out.println("RANDOM: " + (Math.random() * 100));
    }
}
