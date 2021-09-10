import java.util.Scanner;

public class Task3 { // Determine if the number is positive or negative
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int a = in.nextInt();
        if (a == 0) {
            System.out.println("Neither positive nor negative");
        } else {
            System.out.println(a > 0 ? "The number is positive" : "The number is negative");
        }
    }
}
