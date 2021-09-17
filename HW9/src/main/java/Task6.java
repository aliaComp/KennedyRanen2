import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a number");
        String userInput = in.next();
        String reversedNumber = "";
        for (int i = userInput.length(); i > 0; i--) {
            reversedNumber += userInput.charAt(i - 1);
        }
        System.out.println(reversedNumber);
    }
}
