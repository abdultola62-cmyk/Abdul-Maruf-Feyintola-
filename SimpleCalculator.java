import java.util.Scanner;

/**
 * SimpleCalculator - COS 201 Week 3
 * Reads two numbers and displays the result of basic arithmetic expressions.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();

        System.out.println("\n--- Results ---");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " % " + b + " = " + (a % b));
        } else {
            System.out.println("Division and remainder are not possible when the second number is 0.");
        }
        input.close();
    }
}
