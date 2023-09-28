import java.util.Scanner;
// Create a class to perform addition, subtraction, multiplication and division
public class MenuDriven {
    public static void main(String[] args) {
//        Create a Scanner object
        Scanner scanner = new Scanner(System.in);
//        Declare a variable to store the choice of user
        int choice;
//        Create a menu driven program
        do {
//            Display the menu
            System.out.println("Menu : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
//            Take input from user
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
//            Perform the operation according to the choice of user
            switch (choice) {
//                Call the method according to the choice of user
                case 1:
                    performAdition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
//            Repeat the loop until user enters 5
        } while (choice != 5);
        scanner.close();
    }
//    Create a method to perform addition
    public static void performAdition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is : " + (firstNumber + secondNumber));
    }
//    Create a method to perform subtraction
    public static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = scanner.nextInt();
//        Check if first number is greater than second number
        if (firstNumber > secondNumber) {
            System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is : " + (firstNumber - secondNumber));
        } else {
            System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is : " + (secondNumber - firstNumber));
        }
    }
//    Create a method to perform multiplication
    public static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is : " + (firstNumber * secondNumber));
    }
//    Create a method to perform division
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = scanner.nextInt();
//        Check if any number is 0 or not
        if (secondNumber == 0 && firstNumber == 0) {
            System.out.println("Division by zero is not possible");
            return;
        } else if (firstNumber > secondNumber) {
            System.out.println("The Result of " + firstNumber + " and " + secondNumber + " is : " + ((double)firstNumber / secondNumber));
        } else {
            System.out.println("The Result of " + firstNumber + " and " + secondNumber + " is : " + ((double)secondNumber / firstNumber));
        }
    }
}
