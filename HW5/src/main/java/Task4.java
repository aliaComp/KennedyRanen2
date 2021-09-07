import java.util.Scanner;

public class Task4 {
    //Write a program which take number of month from user and print out name of season (summer, winter ...)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number of month from 1 to 12");
        int month = in.nextInt();


        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("No season for this month");
        }

    }
}



