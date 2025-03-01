import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;
        double number;

        // Loop until the user enters 0
        while (true) {
            // Ask the user for input
            System.out.print("Enter a number (or 0 to stop): ");
            number = sc.nextDouble();

            // Break the loop if the number is 0
            if (number == 0) {
                break;
            }

            // Add the entered number to total
            total += number;
        }

        // Display the total value
        System.out.println("The total sum is: " + total);

    }
}
