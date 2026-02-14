import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter your PAN number: ");
        String pan = sc.nextLine().trim();
        Double income = readDouble(sc, "Enter your annual income: ");
        Double deductions = readDouble(sc, "Enter deductions (if any): ");
        if (income == null || deductions == null) return;
        if (income < 0 || deductions < 0) {
            System.out.println("Income/deductions cannot be negative.");
            return;
        }
        double taxableIncome = income - deductions;
        if (taxableIncome < 0) taxableIncome = 0;
        double tax = calculateTax(taxableIncome);
        System.out.println("\nTaxpayer: " + name + " (PAN: " + pan + ")");
        System.out.println("Annual Income: Rs. " + income);
        System.out.println("Deductions: Rs. " + deductions);
        System.out.println("Taxable Income: Rs. " + taxableIncome);
        System.out.println("Total Tax Payable: Rs. " + tax);
    }
    private static double calculateTax(double taxable) {
        double tax = 0;
        if (taxable <= 300000) return 0;
        if (taxable > 300000) {
            double part = Math.min(taxable, 600000) - 300000;
            tax += part * 0.05;
        }
        if (taxable > 600000) {
            double part = Math.min(taxable, 900000) - 600000;
            tax += part * 0.10;
        }
        if (taxable > 900000) {
            double part = taxable - 900000;
            tax += part * 0.15;
        }
        return tax;
    }
    private static Double readDouble(Scanner sc, String msg) {
        System.out.print(msg);
        String s = sc.nextLine().trim();
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return null;
        }
    }
}
