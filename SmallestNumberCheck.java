import java.util.Scanner;  // Import Scanner class for user input

public class SmallestNumberCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // enter three numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();  
        
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt(); 
        
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();  
        
        // Check if the first number is the smallest among the three
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        

    }
}
