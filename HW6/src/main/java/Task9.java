import java.util.Scanner;


public class Task9 { // Enter a symbol from the keyboard. Determine if the entered symbol is a letter or punctuation mark.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the symbol");
        char x = in.next().charAt(0);
        if (isLetter(x)) {
            System.out.println("The symbol is letter");
        }
        else if (isPunctuation (x)){
            System.out.println("The symbol is punctuation mark");
        } else {
            System.out.println("No match");
        }
    }

        static boolean isLetter (char x) {
            if (x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z') {
                return true;
            }
             return false;
        }

        static boolean isPunctuation (char x){
            if (x == '.' || x == ','|| x == ';' || x == ':'|| x== '?' || x == '!' || x== '"' || x == '\'' || x == ')' || x == '(') {
                return true;
            }
              return false;
            }
        }













