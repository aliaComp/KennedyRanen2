import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the hours");
        int hours = in.nextInt();
        System.out.println("Please, enter minutes");
        int minutes = in.nextInt();
        if ((hours < 0 || hours >= 24) || (minutes < 0 || minutes >= 60)) {
            System.out.println("Invalid format");
        }
        else if (hours < 6) {
            System.out.println("Good night");
        } else if (hours < 12) {
            System.out.println("Good morning");
        } else if (hours < 18){
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");

        }
        }
}

