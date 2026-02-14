import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int greatest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        System.out.println("Greatest number: " + greatest);
    }
}
