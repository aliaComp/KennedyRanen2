import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the sentence");
        String str = in.nextLine();
        System.out.println("Please , enter the character");
        char character = in.next().charAt(0);
        int counter = 0;
        boolean isFound = false;
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == character) {
                isFound = true;
                counter++;
                System.out.println("Character is under indexes: " + i);
            }
        }
        if (!isFound) {
            System.out.println("No such character");
        } else {

            System.out.print("Character repeats " + counter + " times");
        }
    }
}



