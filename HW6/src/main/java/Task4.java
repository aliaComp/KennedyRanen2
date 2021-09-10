import java.util.Scanner;

public class Task4 { // Enter three numbers, print out which one is the biggest
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the 1st number");
        double a = in.nextDouble();
        System.out.println("Please, enter the 2nd  number");
        double b = in.nextDouble();
        System.out.println("Please, enter the 3rd number");
        double c = in.nextDouble();


        if ((a>b) && (a>c)){
            System.out.println(a+ " is greater");
        }
        if ((b>a && b>c)){
            System.out.println(b+ " is greater");
        }
        if ((c>b) && (c>a)){
            System.out.println(c+ " is greater");
        } else {
            System.out.println("Numbers are equal");
        }

    }


}
