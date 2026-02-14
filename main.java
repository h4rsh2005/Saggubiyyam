import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter the length of the room (in feet): ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the room (in feet): ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the room (in feet): ");
        double height = sc.nextDouble();

        // Calculate area of 4 walls
        double wallArea = 2 * height * (length + width);

        // Paint coverage
        double coveragePerGallon = 350.0;

        // Calculate gallons required
        double gallonsRequired = wallArea / coveragePerGallon;

        // Round up to nearest whole gallon
        int gallonsToBuy = (int) Math.ceil(gallonsRequired);

        // Output results
        System.out.println("\n----- Paint Calculation Result -----");
        System.out.println("Total wall area: " + wallArea + " square feet");
        System.out.println("Paint required: " + gallonsRequired + " gallons");
        System.out.println("You should buy: " + gallonsToBuy + " gallon(s) of paint");

        sc.close();
    }
}
