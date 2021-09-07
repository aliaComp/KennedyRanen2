import java.util.Scanner;

public class Task5 {
    //Write the program which take name of color from user (red, blue, green, yellow, orange, black, white, pink) and print out length of this word. You can’t use .length() of String. Use switch operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the color");
        String color = input.next();

        switch(color){
            case "red":
                System.out.println("Contains 3 letters");
                break;
            case "blue":
            case "pink":
                System.out.println("Contains 4 letter");
                break;
            case "green":
            case "black":
            case "white":
                 System.out.println("Contains 5 letters");
                    break;
            case "yellow":
            case "orange":
                System.out.println("Contains 6 letters");
                break;
                default:
                System.out.println("No such color in a list");


        }
    }
}
