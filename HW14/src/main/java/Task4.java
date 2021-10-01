import java.util.Scanner;

public class Task4 {//Подсчитать среднюю длину слова во введённом предложении.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please , enter the sentence");
        String str = in.nextLine();
        int wordCounter = 1;
        int letterCounter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                wordCounter++;
                continue;
            } else {
                letterCounter++;
            }
        }
        double average = letterCounter / wordCounter;
        System.out.println("Average length of the word is " + average);
    }
}
