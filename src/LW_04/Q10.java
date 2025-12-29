package LW_04;
import java.util.Scanner;
public class Q10 {

        public static void main(String[] args) {
            // 1. Initialize Scanner to read input
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Text Find and Replace Program ---\n");

            // 2. Get the original sentence (The Scanner's nextLine() method is best for sentences)
            System.out.print("Enter the full sentence you want to modify: ");
            String originalSentence = scanner.nextLine();

            // 3. Get the word to be replaced (target)
            System.out.print("Enter the word to find and replace (the target word): ");
            // Using next() here to easily capture a single word, though nextLine() could also be used
            String wordToReplace = scanner.next();

            // 4. Get the replacement word
            System.out.print("Enter the replacement word: ");
            String replacementWord = scanner.next();

            // Consume the rest of the line to clean up the buffer
            scanner.nextLine();

            // 5. CORE PROCESS: Use the String.replace() method
            // This method automatically finds ALL occurrences of the target and replaces them.
            String modifiedSentence = originalSentence.replace(wordToReplace, replacementWord);

            // 6. Print the results
            System.out.println("\n--- Results ---");
            System.out.println("Original Sentence: " + originalSentence);
            System.out.println("Word to be Replaced: " + wordToReplace);
            System.out.println("Replacement Word: " + replacementWord);
            System.out.println("\nModified Sentence: " + modifiedSentence);
            System.out.println("---------------");

            // 7. Close the scanner
            scanner.close();
        }
    }

