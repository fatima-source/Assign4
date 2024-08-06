import java.util.Scanner;

public class Task8 {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        int p = input.nextInt();
        System.out.println("The minimum product for p = " + p + " is: " + minProduct(p));
    }

    public static long minProduct(int p) {
        long maxNum = (1L << p) - 1;
        long remainder = maxNum - 1;
        long pairs = remainder / 2;
        long minProduct = modularExponentiation(remainder, pairs) * (maxNum % mod) % mod;
        return minProduct;
    }

    public static long modularExponentiation(long a, long b) {
        a %= mod;
        long power = 1;
        while (b > 0) {
            if (b % 2 == 1)
                power = power * a % mod;
            a = a * a % mod;
            b /= 2;
        }
        return power;
    }
}