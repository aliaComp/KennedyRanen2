import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the good's price");
        double price = input.nextDouble();
        System.out.println("Please enter the amount of money");
        double money = input.nextDouble();

        if (money < price) {
            System.out.println("You have insufficient funds.");
        } else {
            int goodsAmount = (int) (money / price);
            double change = money - (goodsAmount * price);
            System.out.println("You can get " + goodsAmount + " good/goods and receive change " + change + " UAH");
        }
    }
}