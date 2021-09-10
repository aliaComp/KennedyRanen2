import java.util.Scanner;

public class Task6 { // If the entered symbol is a digit
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the symbol");
        char x = in.next().charAt(0);
        System.out.println(x>='0' && x<='9' ? "Digit": "Not a digit");
    }
    }

