import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum to 0 and assign the input number to originalNumber
        int sum = 0;
        int originalNumber = number;

        // Loop to process each digit of the number
        while (originalNumber != 0) {
            // Find the last digit of the number
            int remainder = originalNumber % 10;

            // Cube the digit and add it to sum
            sum += remainder * remainder * remainder;

            // Remove the last digit of the number
            originalNumber /= 10;
        }

        // After the loop, check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
