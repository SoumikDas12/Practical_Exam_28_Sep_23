import java.util.Scanner;
// Create a class to calculate the sum of even numbers between two numbers
public class EvenNumberSum {
    public static void main(String[] args) {
//        Create a Scanner object
        Scanner scanner = new Scanner(System.in);
//        Declare a variable to store the sum of even numbers
        int sum = 0;
//        Take input from user
        System.out.print("Enter the start number : ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number : ");
        int end = scanner.nextInt();
//        Calculate the sum of even numbers
        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
//        Print the sum of even numbers
        System.out.println("The sum of even numbers between " + start + " and " + end + " is : " + sum);
    }
}