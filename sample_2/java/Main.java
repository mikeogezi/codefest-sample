import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String word = s.nextLine();
            int len = word.length();
            // Index i starts from the beginning of the word while j starts from the end
            // We add 1 to i and subtract 1 from j at the end of every iteration of the loop
            for (int i = 0, j = len - 1; i < len && j >= 0; ++i, --j) {
                // If the letters at indices i and j are not equal then it can't be a palindrome 
                if (word.charAt(i) != word.charAt(j)) {
                    System.out.println("No");
                    break;
                }
                // If the letters at indices i and j have been equal till the end then it's a palindrome
                if (j == 0) {
                    System.out.println("Yes");
                }
            }
        }
    }
}