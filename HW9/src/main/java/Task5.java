import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a number");
        int number = in.nextInt();
        boolean isNonDecreasingOrder = true;

            for (; number > 0; number /= 10) {
                if (number % 10 < number % 100 / 10) {
                    number /= 10;
                    System.out.println("In decreasing order");
                    return;
                }
            }
                System.out.println("In non decreasing order");
            }
        }






