import java.util.Scanner;

/**
 * ItemCost - COS 201 Week 3
 * Calculates the total cost of an item from its unit price and quantity,
 * including 7.5% VAT.
 */
public class ItemCost {
    public static void main(String[] args) {
        final double VAT_RATE = 0.075;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double subtotal = unitPrice * quantity;
        double vat = subtotal * VAT_RATE;
        double total = subtotal + vat;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item     : " + itemName);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.println("Quantity : " + quantity);
        System.out.printf("Subtotal : %.2f%n", subtotal);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.printf("Total    : %.2f%n", total);
        input.close();
    }
}
