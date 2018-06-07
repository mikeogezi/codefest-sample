import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) { // Read input line by line
            String line = s.nextLine(); // Get line from input stream
            String [] numberStrings = line.split(" "); // Split the space separated line to each number
            long sum = 0, num;
            for (String numberString : numberStrings) {
                num = Long.valueOf(numberString); // Convert each string to a long integer
                sum += num; // Add to the sum
            }
            double output = Math.sqrt(sum); // Calculate the square root of the sum
            System.out.printf("%.4f\n", output); // Print out the result
        }
    }
}