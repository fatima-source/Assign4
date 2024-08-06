import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversed = reverse(str, str.length());
        System.out.println("Reversed string: " + reversed);
    }

    private static String reverse(String str, int length) {
        if (length == 0) {
            return "";
        }
        return str.charAt(length - 1) + reverse(str, length - 1);
    }
}
