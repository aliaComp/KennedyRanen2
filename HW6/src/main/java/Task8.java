import java.util.Scanner;

public class Task8 { //Write a program to check the multiplicity of a number X to a number Y (both numbers are entered from the keyboard).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter x digit");
        int x = in.nextInt();
        System.out.println("Please, enter y digit");
        int y = in.nextInt();
        System.out.println(x % y == 0 ? x + " is multiple of" + y : x +" is not multiple of " + y);
    }
}
