import java.util.Scanner;

public class Task4 { //Write a program to extract each digit from a double, in the reverse order.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number with a remainder");
        String userInput = in.next();
        String reversedNumber = "";
        for (int i = userInput.length(); i > 0; i--) {
            reversedNumber += userInput.charAt(i - 1) + " ";
        }
        System.out.println(reversedNumber);
    }
}



