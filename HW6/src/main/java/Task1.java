import java.util.Scanner;

public class Task1 { //Determine if the entered number is even number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int a = in.nextInt();
        System.out.println(a % 2==0 ? "Even number" : "Not even number" );
    }
}
