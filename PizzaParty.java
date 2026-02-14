import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of pizzas:");
        int numberOfPizzas = sc.nextInt();

        System.out.println("Enter number of slices per pizza:");
        int slicesPerPizza = sc.nextInt();

        System.out.println("Enter number of people:");
        int numberOfPeople = sc.nextInt();

        int totalSlices = numberOfPizzas * slicesPerPizza;

        int slicesPerPerson = totalSlices / numberOfPeople;
        int leftoverSlices = totalSlices % numberOfPeople;

        int extraSlicesNeeded = 0;

        if (leftoverSlices != 0) {
            extraSlicesNeeded = numberOfPeople - leftoverSlices;
        }

        System.out.println("\nTotal slices: " + totalSlices);
        System.out.println("Each person gets: " + slicesPerPerson + " slice(s).");
        System.out.println("Slices left over: " + leftoverSlices);

        if (extraSlicesNeeded == 0) {
            System.out.println("No extra slices are needed. The slices divide evenly.");
        } else {
            System.out.println("Extra slices needed for exact division: " + extraSlicesNeeded);
        }

        sc.close();
    }
}


