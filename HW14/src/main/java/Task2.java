import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please , enter the word");
        String str = in.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'a': case'A':     case'и': case'И':      case'ё': case'Ё':
                case 'i': case'I':     case'а': case'А':      case'э': case'Э':
                case 'e': case'E':     case'у': case'У':      case'я': case'Я':
                case 'y': case'Y':     case'о': case'О':      case'ю': case'Ю':
                case 'u': case'U':     case'ы': case'Ы':      case'е': case'Е':
                case 'o': case'O':
                    counter++;
            }

            }
        System.out.println("Amount of vowels " + counter);
        }

    }




