import java.util.Scanner;

public class Task4 { // Enter the coordinates of the point (x, y) and determine the number of the quarter in which this point falls. It is also necessary to provide for the case of hitting a point on the axis or at the origin.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter coordinate x");
        float x = in.nextFloat();
        System.out.println("PLease, enter coordinate y");
        float y = in.nextFloat();

        if ((x > 0) && (y > 0)){
            System.out.println("The point is on the 1st quarter");
        } else if ((x < 0) && (y > 0)){
            System.out.println("The point is on the 2nd quarter");
        } else if ((x < 0) && (y < 0)){
            System.out.println("The point is on the 3rd quarter");
        } else if ((x > 0) && (y < 0)){
            System.out.println("The point is on the 4th quarter");
        } else {
            System.out.println(x == 0 && y !=0 ? "The point is on the y-axis"
                    : x != 0 ? "The point is on the x-axis"
                    : "The point is on the origin of the coordinates");
        }
    }
}


