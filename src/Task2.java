import java.util.*;
public class Task2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            str = str.toUpperCase();
            if(ispalindrome(str,str.length()) == true){
                System.out.println("It is palindrome...");
            }
           else{
                System.out.println("It is not a palindrome...");
            }
        }

        public static boolean ispalindrome(String s, int len) {
            if (len <= 1) {
                return true;
            }

            if (s.charAt(0) != s.charAt(len - 1)) {
                return false;
            }
            return ispalindrome(s.substring(1, len - 1), len - 2);
        }
    }


