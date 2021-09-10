import java.util.Scanner;

public class Task7 { //Enter a number from the keyboard and check if this number belongs to the range from 1 to 30.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the digit");
        int x = in.nextInt();
        if (x>=1 && x<=30){
            System.out.println("In the range from 1 to 30");

        } else {
            System.out.println("Not in the range");
        }

    }
}
