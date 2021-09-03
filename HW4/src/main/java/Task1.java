import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the room length");
        double length = input.nextDouble();
        System.out.println("Please enter the room width");
        double width = input.nextDouble();
        System.out.println("Please enter the room height");
        double height = input.nextDouble();
        System.out.println("Please enter the amount of paint for 1m² in l");
        double paint = input.nextDouble();
        System.out.println("Please enter the price of paint for 1l");
        double price = input.nextDouble();
        System.out.println("Please enter the percentage of surface covered by windows");
        double window = input.nextDouble();

        double totalSurfaceAreaWithoutWindows = (2 * height * width + 2 * height * length) * ((100 - window) / 100);
        double requiredPaint = totalSurfaceAreaWithoutWindows * paint;
        double totalPaintPrice = requiredPaint * price;
        System.out.println("You will need " + requiredPaint + "l of paint, total price of which is "+totalPaintPrice+"UAH");







    }
}
