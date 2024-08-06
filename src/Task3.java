import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number...");
        int num = input.nextInt();
        System.out.println("Enter digit...");
        int digit = input.nextInt();
        System.out.println(countDigit(num,digit));
    }

    private static int countDigit(int num, int digit) {
        int count = 0;
        int last_digit = num % 10;
        if(num <= 0)
        {
            return 0;
        }
        if(last_digit == digit){
            count++;
        }
        return count + countDigit(digit,num / 10);
    }

}
