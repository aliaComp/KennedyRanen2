import java.util.Scanner;

public class Task2 {// Write a Java program to divide a string in n equal parts

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the sentence");
        String str = in.nextLine();

        int n = 2;
        int part = str.length() / n;
        if (str.length() % n != 0) {
            System.out.println("String can not be divided equally ");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i % part == 0)
                    System.out.println();
                    System.out.print(str.charAt(i));

                }
            }
        }
    }





