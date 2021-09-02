import java.util.Scanner;

public class Task5 {
    //// Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a");
        double a = input.nextDouble();
        System.out.println("Please enter b");
        double b = input.nextDouble();
        System.out.println("Please enter c");
        double c = input.nextDouble();
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant < 0){
            System.out.println("No roots");
        }

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (determinant == 0) {

            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
    }
}
