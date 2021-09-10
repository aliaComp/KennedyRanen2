import java.util.Scanner;

public class Task2 { // Enter 2 number and determine the smaller
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = in.nextInt();
        System.out.println("Please enter second number");
        int b = in.nextInt();
        if(a==b){
            System.out.println("Numbers are equal");
        } else {
            System.out.println( a < b ? a + " is smaller": b+ " is smaller");
        }

        }

    }

