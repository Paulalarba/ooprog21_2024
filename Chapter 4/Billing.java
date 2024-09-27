import java.util.Scanner;

public class Billing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER THE PRICE OF THE ITEM: ");
        double price = scan.nextDouble();

        System.out.print("ENTER THE QUANTITY OF THE ITEM: ");
        int quantity = scan.nextInt();

        System.out.print("ENTER THE COUPON DISCOUNT OF THE ITEM: ");
        int couponDiscount = scan.nextInt();

        computeBill(price);
        computeBill(price, quantity);
        computeBill(price, quantity, couponDiscount);
    }

    public static void computeBill(double price) {
        double totalBill = price * 1.08; // Price plus 8% tax
        System.out.printf("THE TOTAL PRICE OF THE BILL IS: $%.2f\n", totalBill);
    }

    public static void computeBill(double price, int quantity) {
        double totalBill = price * quantity * 1.08; // Quantity times price plus tax
        System.out.printf("THE TOTAL PRICE OF THE BILL IS: $%.2f\n", totalBill);
    }

    public static void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double totalBill = (subtotal - couponDiscount) * 1.08; // Apply discount and then tax
        System.out.printf("THE TOTAL PRICE OF THE BILL IS: $%.2f\n", totalBill);
    }
}
