import java.util.Scanner;

public class Task3 { // Variant 2 (Lucky trolley ticket)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the 6-digit number of the ticket");
        int a = in.nextInt();
        int firstThreeDigits = a / 1000;
        int lastThreeDigits = a % 1000;
        int sumFirstThreeDigits = ((firstThreeDigits / 100) + (firstThreeDigits % 100 / 10) + (firstThreeDigits % 10));
        int sumLastThreeDigits = ((lastThreeDigits / 100) + (lastThreeDigits % 100 / 10) + (lastThreeDigits % 10));

        if (sumFirstThreeDigits == sumLastThreeDigits){
            System.out.println("Your ticket is lucky");
        } else {
            System.out.println("Your ticket is not lucky");
        }
    }
}
