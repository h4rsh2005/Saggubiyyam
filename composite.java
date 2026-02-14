import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isComposite = true;

        if (num <= 1) {
            isComposite = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isComposite = false;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println(num + " is not a composite number.");
        } else {
            System.out.println(num + " is a composite number.");
        }

        sc.close();
    }
}
