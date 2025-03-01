import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start value
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown loop using for-loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current counter value
        }

        System.out.println("Blast off! The rocket has launched!");

    }
}
