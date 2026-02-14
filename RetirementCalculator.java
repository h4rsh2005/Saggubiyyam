import java.util.Scanner;
import java.time.Year;

public class RetirementCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your current age:");
        int currentAge = sc.nextInt();

        System.out.println("Enter your desired retirement age:");
        int retirementAge = sc.nextInt();

        System.out.println("Enter your expected lifetime:");
        int expectedLifetime = sc.nextInt();

        if (retirementAge <= currentAge) {
            System.out.println("you canalready retire");
        } else {

            System.out.println("Enter your current savings:");
            double currentSavings = sc.nextDouble();

            System.out.println("Enter annual interest rate (in %):");
            double interestRate = sc.nextDouble();

            int yearsLeft = retirementAge - currentAge;
            int yearsAfterRetirement = expectedLifetime - retirementAge;

            int currentYear = Year.now().getValue();
            int retirementYear = currentYear + yearsLeft;

            // Compound Interest Formula
            double futureSavings = currentSavings *
                    Math.pow((1 + interestRate / 100), yearsLeft);

            System.out.println("\nYou have " + yearsLeft + " years left until retirement.");
            System.out.println("You will retire in the year " + retirementYear + ".");
            System.out.println("Expected lifetime: " + expectedLifetime + " years old.");
            System.out.println("Years after retirement: " + yearsAfterRetirement + " years.");

            System.out.printf("Your current savings: $%.2f\n", currentSavings);
            System.out.printf("Your savings at retirement: $%.2f\n", futureSavings);
        }

        sc.close();
    }
}
