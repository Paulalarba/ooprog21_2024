import java.util.Scanner;

public class SortingThreeNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input three numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Determine the order and display the numbers in ascending order
        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }

        scanner.close();
    }
}