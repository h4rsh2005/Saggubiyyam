import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Apple", "Milk", "Rice", "Bread", "Eggs"};
        double[] prices = {20, 50, 60, 30, 70};
        System.out.println("Mini Basket - Simple Cart");
        System.out.println("Products:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - Rs. " + prices[i]);
        }
        double total = 0;
        while (true) {
            System.out.print("\nEnter product number to add (0 to checkout): ");
            String input = sc.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                continue;
            }
            if (choice == 0) break;
            if (choice < 1 || choice > names.length) {
                System.out.println("Invalid product number.");
                continue;
            }
            total += prices[choice - 1];
            System.out.println(names[choice - 1] + " added.");
        }
        System.out.println("\nFinal Bill: Rs. " + total);
        System.out.println("Thanks for shopping!");
    }
}
