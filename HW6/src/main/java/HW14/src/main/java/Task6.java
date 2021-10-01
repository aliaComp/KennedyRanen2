import java.util.*;

public class Task6 {//Посчитать, сколько раз заданное слово содержится в строке

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please , enter the sentence");
        String str = in.nextLine();
        System.out.println("Please, enter the word which you need to count in current sentence");
        String word = in.nextLine();


        int lastPos = -1;
        int counter = 0;
        while (true) {
            lastPos = str.indexOf(word, lastPos + 1);
            if (lastPos < 0) break;
            counter++;
        }


        System.out.println("The word " + word + " presents " + counter + " times");
    }
}




