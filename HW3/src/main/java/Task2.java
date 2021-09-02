import java.util.Scanner;

public class Task2 {
    // program which count the volume of cylinder and print result in console. Radius and height user input from console
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter radius");
        double radius = input.nextDouble();
        System.out.println("Please enter height");
        double height = input.nextDouble();
        double volume = countVolume(radius,height);
        System.out.println("Volume is "+volume);
    }
    private static double countVolume(double r, double h) {
        return 3.14*r*r*h;
    }
}




