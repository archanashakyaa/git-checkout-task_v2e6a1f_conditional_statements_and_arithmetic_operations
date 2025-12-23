import java.util.Scanner;

/**
 * Food Bill Discount System
 * This program calculates discounts for food delivery orders based on customer age.
 */
public class Main {
    
    // Constants for discount rules
    private static final int SENIOR_CITIZEN_AGE = 60;
    private static final double SENIOR_DISCOUNT_PERCENTAGE = 0.30;
    private static final double MAX_DISCOUNT = 300.0;
    
    /**
     * Main method - Entry point of the program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Prompt and read customer age
        System.out.print("Enter age: ");
        
        // TODO: Prompt and read bill amount
        System.out.print("Enter Bill amount: ");
        
        // TODO: Determine customer type and calculate discount
        
        // TODO: Display customer type (Normal User or Senior Citizen)
        
        // TODO: Display final bill amount
        
        scanner.close();
    }
    
    /**
     * Determines if a customer is a senior citizen
     * @param age The age of the customer
     * @return true if senior citizen, false otherwise
     */
    public static boolean isSeniorCitizen(int age) {
        // TODO: Implement this method
        return false;
    }
    
    /**
     * Calculates the discount amount for senior citizens
     * @param billAmount The original bill amount
     * @return The discount amount (capped at MAX_DISCOUNT)
     */
    public static double calculateDiscount(double billAmount) {
        // TODO: Implement this method
        return 0.0;
    }
    
    /**
     * Calculates the final bill amount after applying discount
     * @param billAmount The original bill amount
     * @param discount The discount amount
     * @return The final bill amount
     */
    public static double calculateFinalBill(double billAmount, double discount) {
        // TODO: Implement this method
        return 0.0;
    }
}