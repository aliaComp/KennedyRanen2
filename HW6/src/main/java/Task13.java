import java.util.Scanner;

public class Task13 { // Palindrome number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the 5-digit number");
        int a = in.nextInt();
        int firstTwoDigits = a / 1000;
        int lastTwoDigits = a % 100;
        int lastTwiDigitsMirrored = ((int)(lastTwoDigits / 10) + (lastTwoDigits % 10) * 10);
        if (firstTwoDigits == lastTwiDigitsMirrored){
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
