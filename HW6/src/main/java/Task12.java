import java.util.Scanner;

public class Task12 { //Enter the number (not more than 4 digits). Determine the number of digits in it.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int a = in.nextInt();

        if (a % 10 == a) {
            System.out.println("1 digit");
        }
            else if (a % 100 == a){
                System.out.println("2 digits");
            }
            else if (a % 1000 == a){
                System.out.println("3 digits");
            }
            else if (a % 10000 == a){
                System.out.println("4 digits");
            } else {
                System.out.println("The number consists of more than 4 digits");
            }
        }
    }

