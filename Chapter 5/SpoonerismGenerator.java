import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two words
        System.out.print("Enter word 1: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter word 2: ");
        String word2 = scanner.nextLine();

        // Find the first vowel index
        int vowelIndex1 = findFirstVowelIndex(word1);
        int vowelIndex2 = findFirstVowelIndex(word2);

        // Check if both words are suitable for Spoonerism
        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println("The words are not suitable for a Spoonerism.");
        } else {
            // Create Spoonerism
            String spoonerizedWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
            String spoonerizedWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }

        scanner.close();
    }

    // Method to find the index of the first vowel in a word
    private static int findFirstVowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // No vowel found
    }
}
