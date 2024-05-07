import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hey, Welcome to Simple Calculator! Ready for calculation:");
           
            System.out.println();

            System.out.println("Enter first whole number: ");
            int firstNumber = scanner.nextInt();

            System.out.println();

            System.out.println("Choose arithmetic operator (+, -, /, *):  ");
            String symbol = scanner.next();

            System.out.println("Enter Second Whole number: ");
            int secondNumber = scanner.nextInt();

            switch (symbol) {

                case "+":
                    System.out.println("The answer is: ");
                    System.out.println(firstNumber + secondNumber);
                    break;

                case "/":
                    if (secondNumber != 0) {
                        System.out.println("The answer is: ");
                        System.out.println(firstNumber / secondNumber);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case "*":
                    System.out.println("The answer is: ");
                    System.out.println(firstNumber * secondNumber);
                    break;

                case "-":
                    System.out.println("The answer is: ");
                    System.out.println(firstNumber - secondNumber);
                    break;

                default:
                    System.out.println("Oops, the arithmetic operator you have chosen is too advanced for me."
             
                    		+ " Please restart and choose a different one.");
            }
            scanner.close();
        }
        
    }

}

/*The following code is about a very simple calculator. It prompts the user to enter two whole numbers then compute the two entries
 * by means of either additiona, subtraction, multiplication or divison only.
 */
