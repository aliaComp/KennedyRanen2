import java.util.Scanner;

public class Task5 { // Calculator
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the 1st number");
        double a = in.nextDouble();
        System.out.println("Please, enter the 2nd  number");
        double b = in.nextDouble();
        System.out.println("Choose the operation you want to do:\n1)" +a + "+" + +b + "\n2)" +a + "-"  +b + "\n3)" +a +"*"+ +b + "\n4)" +a + "/"+ +b);
        int result = in.nextInt();
        double sum = a+b;
        double sub = a-b;
        double multp = a*b;
        double div = a / b;


        switch (result){
            case 1:
                System.out.println("The result is " +sum);
                break;
            case 2:
                System.out.println("The result is " +sub);
                break;
            case 3:
                System.out.println("The result is " +multp);
                break;
            case 4:
                System.out.println("The result is " +div);
                break;
            default:
                System.out.println("No such option");

        }
    }
}

