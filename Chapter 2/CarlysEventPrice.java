import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("How many guests are attending for today's event?");
        int numberOfGuests = scanner.nextInt();

        int pricePerGuest = 35;
        int totalPrice = numberOfGuests * pricePerGuest;


        System.out.println("*************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*         it a party.               *");
        System.out.println("*************************************");
        
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);
        
        if (numberOfGuests >= 50) {
            System.out.println("This is a large event.");
        } else {
            System.out.println("This is not a large event.");
        }

        scanner.close();
    }
}
