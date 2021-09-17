import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the amount of money in UAH");
        double amount = in.nextDouble();

        final double EUR = 31.39;
        final double USD = 26.75;
        final double RUB = 0.36;
        if (amount <= 0) {
            System.out.println("You've entered invalid input");
        } else {
            System.out.println("Choose the operation you want to do:" +
                    "\n1)convert to EUR" +
                    "\n2)convert to USD" +
                    "\n3)convert to RUB");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You will get " + amount / EUR);
                    break;
                case 2:
                    System.out.println("You will get " + amount / USD);
                    break;
                case 3:
                    System.out.println("You will get " + amount / RUB);
                    break;
                default:
                    System.out.println("No such option in the list");

            }
        }
    }
}
