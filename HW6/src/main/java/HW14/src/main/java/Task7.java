import java.util.Scanner;

public class Task7 {//Заменить по строке одно заданное слово на другое.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please , enter the sentence");
        String str = in.nextLine();
        System.out.println("Please, enter the word which you want to replace");
        String wordToReplace = in.nextLine();
        System.out.println("Please, enter to which word the previous should be changed");
        String inputWord = in.nextLine();
        String result = str.replace(wordToReplace, inputWord);
        System.out.println(result);
    }
}




