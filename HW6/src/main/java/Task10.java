import java.util.Scanner;

public class Task10 { //Enter the number and determine whether it is a multiple of 3, 5, 7.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the digit");
        int a = in.nextInt();
        if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0){
            System.out.println(a + " is multiple of 3,5 and 7");
        } else {
            System.out.println(a + " is not multiple of 3,5 and 7");
        }
    }
}
