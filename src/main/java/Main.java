import java.util.Scanner;

public class Main {
    private static final int SENIOR_CITIZEN_AGE = 60;
    private static final double SENIOR_DISCOUNT_RATE = 0.30;
    private static final double MAX_DISCOUNT_CAP = 300.00;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter bill amount: ");
        double billAmount = scanner.nextDouble();
        
        String customerType = determineCustomerType(age);
        double finalBill = calculateFinalBill(age, billAmount);
        
        displayBillSummary(age, billAmount, customerType, finalBill);
        
        scanner.close();
    }
    
    private static String determineCustomerType(int age) {
        if (age >= SENIOR_CITIZEN_AGE) {
            return "Senior Citizen";
        } else {
            return "Normal User";
        }
    }
    
    private static double calculateFinalBill(int age, double billAmount) {
        if (age >= SENIOR_CITIZEN_AGE) {
            double discountAmount = billAmount * SENIOR_DISCOUNT_RATE;
            
            if (discountAmount > MAX_DISCOUNT_CAP) {
                discountAmount = MAX_DISCOUNT_CAP;
            }
            
            return billAmount - discountAmount;
        } else {
            return billAmount;
        }
    }
    
    private static void displayBillSummary(int age, double billAmount, String customerType, double finalBill) {
        System.out.println("\nEnter age: " + age);
        System.out.println("Enter bill amount: " + String.format("%.2f", billAmount));
        System.out.println(customerType);
        System.out.println("Final bill amount: " + String.format("%.2f", finalBill));
        
        if (age >= SENIOR_CITIZEN_AGE) {
            double discountAmount = billAmount - finalBill;
            String discountInfo;
            
            if (discountAmount >= MAX_DISCOUNT_CAP) {
                discountInfo = String.format("30%% discount = $%.2f, but capped at $%.2f", billAmount * SENIOR_DISCOUNT_RATE, MAX_DISCOUNT_CAP);
            } else {
                discountInfo = String.format("30%% discount = $%.2f", discountAmount);
            }
            
            System.out.println(discountInfo);
        } else {
            System.out.println("Age < 60, no discount applied");
        }
    }
}
