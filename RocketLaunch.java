import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start value
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter); // Print the current counter value
            counter--; // Decrement the counter
        }

        System.out.println("🚀 Blast off! The rocket has launched!");

    }
}
