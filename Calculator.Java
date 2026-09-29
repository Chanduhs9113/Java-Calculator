import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;
        System.out.println();
        System.out.println("============================");
        System.out.println(" Welcome to the Calculator!");

        while(continueCalculation){
            displayMenu();

            try {
                System.out.print("Enter your choice (1-6): ");
                int choice = sc.nextInt();

                if(choice == 6){
                    continueCalculation = false;
                    System.out.println("Exiting the calculator. Thank YOU");
                    break;
                }
                if(choice<1||choice>6){
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
                }
                System.out.print("Enter the first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = sc.nextDouble();
                double result = 0;
                System.out.println("Result: ");
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = divide(num1, num2);
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    case 5:
                        if (num2 ==0){
                            System.out.println("Error");
                        }
                        else{
                            result = modulus(num1,num2);
                            System.out.println(num1 + " % " + num2 + " = " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                sc.nextLine(); 
            }
            catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage()+ "\n");
            }
        
        }
        sc.close();

        
}
private static void displayMenu() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static double modulus(double a, double b){
        return a%b;
    }
}