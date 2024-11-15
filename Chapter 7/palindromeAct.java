import java.util.Scanner;

class palindromeAct {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a string:");
      String str = sc.nextLine();

      String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      
      String rev = "";
      int length = normalizedStr.length();
      for (int i = length - 1; i >= 0; i--) {
         rev = rev + normalizedStr.charAt(i);
      }
      
      if (normalizedStr.equals(rev))
         System.out.println(str + " is a palindrome");
      else
         System.out.println(str + " is not a palindrome");

      sc.close();
   }
}
