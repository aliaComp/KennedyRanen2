import java.util.Scanner;

public class Task2 { // Variant 1 (The program for calculating the ideal weight for height. Enter height and weight, print out a message about how much kg to gain or lose (ideal weight = height - 110))
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the height");
        float height = in.nextFloat();
        System.out.println("Please, enter the weight");
        float weight = in.nextFloat();
        float idealWeight = height - 110;

        if (idealWeight < weight){
            System.out.println("You need to loose " + (weight - idealWeight) + "kg");
        } else if (idealWeight > weight){
            System.out.println("You need to gain " + (idealWeight - weight) + "kg");
        } else {
            System.out.println("Your weight is perfect");
        }
    }
}
