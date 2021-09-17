
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a number");
        int number = in.nextInt();
        if (number < 0){
            number *= -1;
        }
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
