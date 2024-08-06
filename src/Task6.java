import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base...");
        int base = input.nextInt();
        System.out.println("Enter exponent...");
        int exponent = input.nextInt();

        if (exponent < 1) {
            System.out.println("Exponent must be greater than or equal to 1.");
        } else {
            System.out.println("Result: " + power(base, exponent));
        }
    }

    private static int power(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }
}
