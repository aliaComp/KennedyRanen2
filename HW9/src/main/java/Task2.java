import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) { //currently the retirement age for men and women is the same =  60 years
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println( age >= 60 ? "It's time to retire" : "You are too young for this");
    }

}

