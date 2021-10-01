import java.util.Scanner;

public class Task3 {//Подсчитать количество слов во введённом предложении.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please , enter the sentence");
        String str = in.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println("Sentence has " + counter + " words");
    }
}

