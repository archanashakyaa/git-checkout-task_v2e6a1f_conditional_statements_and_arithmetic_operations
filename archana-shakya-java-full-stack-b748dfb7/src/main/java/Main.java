import java.util.Scanner;

/**
 * Food Bill Discount System
 * Calculates discounts for food delivery orders based on customer age.
 */
public class Main {

    // Constants for discount rules
    private static final int SENIOR_CITIZEN_AGE = 60;
    private static final double SENIOR_DISCOUNT_PERCENTAGE = 0.30;
    private static final double MAX_DISCOUNT = 300.0;

    /**
     * Main method - Entry point of the program
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read customer age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Prompt and read bill amount
        System.out.print("Enter Bill amount: ");
        double billAmount = scanner.nextDouble();

        boolean seniorCitizen = isSeniorCitizen(age);
        double discount = seniorCitizen ? calculateDiscount(billAmount) : 0.0;
        double finalBill = calculateFinalBill(billAmount, discount);

        // Display customer type
        if (seniorCitizen) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Normal User");
        }

        // Display final bill amount formatted to 2 decimal places
        System.out.println(String.format("Final Bill amount: %.2f", finalBill));

        scanner.close();
    }

    /**
     * Determines if a customer is a senior citizen.
     */
    public static boolean isSeniorCitizen(int age) {
        return age >= SENIOR_CITIZEN_AGE;
    }

    /**
     * Calculates the discount amount for senior citizens,
     * capped at MAX_DISCOUNT.
     */
    public static double calculateDiscount(double billAmount) {
        double discount = billAmount * SENIOR_DISCOUNT_PERCENTAGE;
        return Math.min(discount, MAX_DISCOUNT);
    }

    /**
     * Calculates the final bill amount after applying discount.
     */
    public static double calculateFinalBill(double billAmount, double discount) {
        return billAmount - discount;
    }
}
