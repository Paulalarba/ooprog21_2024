import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy’s makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("Enter the number of minutes the equipment was rented: ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int pricePerHour = 40;
        int totalPrice = (hours * pricePerHour) + minutes;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total price: " + totalPrice);

    }
}

