import java.util.Scanner;

public class Task1 {
    // Write a program which take four numbers from the user and print out just that few of them which divide by 3 or 5 without remainder
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int a = input.nextInt();
        System.out.println("Please enter 2nd number");
        int b = input.nextInt();
        System.out.println("PLease enter 3rd number");
        int c = input.nextInt();
        System.out.println("Please enter 4th number");
        int d = input.nextInt();

        if ((a % 3==0) || (a % 5==0)) {
            System.out.println("" +a);
        }
        if ((b % 3==0) || (b % 5==0)) {
            System.out.println("" +b);
        }
        if ((c % 3==0) || (c % 5==0)) {
            System.out.println("" +c);
        }
        if ((d % 3==0) || (d % 5==0)) {
            System.out.println("" +d);
        } else{
            System.out.println("No targeted numbers");


        }
    }
}




