import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people...");
        int num_of_people = input.nextInt();
        System.out.println(handShake_count(num_of_people));
    }

    public static int handShake_count(int num_of_people) {
        if (num_of_people <= 1) {
            return 0;
        }
        return num_of_people-1 + handShake_count(num_of_people-1);
    }
}
