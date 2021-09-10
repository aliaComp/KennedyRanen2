import java.util.Scanner;

public class Task11 { //Determine the absolute value of the entered number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the digit");
        double a = in.nextDouble();
        System.out.println( a >= 0 ? "Absolute value = " +a : "Absolute value = " +a * -1);
    }
}
