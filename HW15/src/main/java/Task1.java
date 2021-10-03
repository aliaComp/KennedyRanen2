import java.util.Scanner;

public class Task1 {// Write a Java program to find first non repeating character in a string.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the sentence");
        String str = in.nextLine();
        boolean isUnique = false;
        for(char i :str.toCharArray()){
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                isUnique = true;
                System.out.println("First non-repeating character is: " +i);
                break;
            }
        }
        if (!isUnique) {
            System.out.println("No unique characters");
        }
    }
}

