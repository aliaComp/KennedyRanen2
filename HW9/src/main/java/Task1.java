import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter month");
        int month = in.nextInt();
        System.out.println("Please, enter day");
        int day = in.nextInt();

        if (month > 0 && month <= 12){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println( day > 0 && day <= 31 ? "The date is correct" : "Incorrect date");
                     break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println( day > 0 && day <= 30 ? "The date is correct" : "Incorrect date");
                     break;
                case 2:
                    System.out.println( day > 0 && day <= 29 ? "The date is correct" : "Incorrect date");
                    break;
            }

        } else {
            System.out.println("Fatal Error!");
        }
        System.out.println("Please, enter hours");
        int hours = in.nextInt();
        System.out.println(hours >= 1 && hours <= 12 ? "Hours are correct" : "Incorrect format");
        System.out.println("Please, enter minutes");
        int minutes = in.nextInt();
        System.out.println(minutes >= 0 && minutes <= 60 ? "Minutes are correct" : "Incorrect format" );
    }
}
