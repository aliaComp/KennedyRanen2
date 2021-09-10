import java.util.Scanner;

public class Task14 { // Coordinates, rectangle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter top left x value");
        float x1 = in.nextFloat();
        System.out.println("Please, enter top left y value");
        float y1 = in.nextFloat();
        System.out.println("Please, enter top right x value");
        float x2 = in.nextFloat();
        System.out.println("Please, enter top right y value");
        float y2 = in.nextFloat(); //y1==y2
        System.out.println("Please, enter bottom left x value");
        float x3 = in.nextFloat(); // x1==x3
        System.out.println("Please, enter bottom left y value");
        float y3 = in.nextFloat();
        System.out.println("Please, enter bottom right x value");;
        float x4 = in.nextFloat(); // x2==x4
        System.out.println("Please, enter bottom right y value");
        float y4 = in.nextFloat();// y3==y4
        System.out.println("Enter the x value for the point");
        float X = in.nextFloat();
        System.out.println("Enter the y value for the point");
        float Y = in.nextFloat();
        if (
                (X >= x1 && X <= x2) && (Y <= y1 && Y >= y3)) {
            System.out.println("The point belongs to the rectangle");
        } else {
            System.out.println("The point does not belong to the rectangle");
        }
    }
}
