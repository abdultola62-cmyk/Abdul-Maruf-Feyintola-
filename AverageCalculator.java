import java.util.Scanner;

/**
 * AverageCalculator - COS 201 Week 3
 * Reads three test scores and calculates their sum and average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter the second score: ");
        double score2 = input.nextDouble();
        System.out.print("Enter the third score: ");
        double score3 = input.nextDouble();

        double sum = score1 + score2 + score3;
        double average = sum / 3;

        System.out.println("\nSum     = " + sum);
        System.out.printf("Average = %.2f%n", average);
        input.close();
    }
}
