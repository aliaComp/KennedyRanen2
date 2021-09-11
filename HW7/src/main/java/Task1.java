import java.util.Scanner;

public class Task1 { //Variant 1 ( if a straight line is parallel to the y-axis or to the x-axis)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter coordinates for the A (x)");
        float x1 = in.nextFloat();
        System.out.println("PLease, enter coordinates for A (y)");
        float y1 = in.nextFloat();
        System.out.println("Please, enter coordinates for B (x)");
        float x2 = in.nextFloat();
        System.out.println("Please , enter coordinates for B (y)");
        float y2 = in.nextFloat();
        System.out.println((x1 == x2) ? "Line is parallel to y-axis"
                : (y1 == y2) ? "Line parallel the x-axis"
                : "Line is not parallel to x-axis or y-axis");

    }

}
