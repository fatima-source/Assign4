import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x < 0 || y < 0) {
            System.out.println("Both numbers must be non-negative.");
        } else {
            System.out.println("GCD: " + gcd(x, y));
        }
    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
