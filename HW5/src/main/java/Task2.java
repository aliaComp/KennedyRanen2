import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Task2 {
    //Write a program which take string from console and print out whether it contains numbers, uppercase symbols, lowercase symbols, special characters (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the expression");
        String str = in.nextLine();


        if (
                isUpperCase(str.charAt(0)) ||
                        isUpperCase(str.charAt(1)) ||
                        isUpperCase(str.charAt(2)) ||
                        isUpperCase(str.charAt(3))
        ) {
            System.out.println("Contains Upper case symbol(s)");
        }
        if (
                isLowerCase(str.charAt(0)) ||
                        isLowerCase(str.charAt(1)) ||
                        isLowerCase(str.charAt(2)) ||
                        isLowerCase(str.charAt(3))
        ) {
            System.out.println("Contains lower case symbol(s)");
        }
        if (
                isDigit(str.charAt(0)) ||
                        isDigit(str.charAt(1)) ||
                        isDigit(str.charAt(2)) ||
                        isDigit(str.charAt(3))
        ) {
            System.out.println("Contains digit(s)");
        }
        if (
                isSpecialCharacter(str.charAt(0)) ||
                        isSpecialCharacter(str.charAt(1)) ||
                        isSpecialCharacter(str.charAt(2)) ||
                        isSpecialCharacter(str.charAt(3))

        ) {
            System.out.println("Contains special character(s)");
        }
    }

        static boolean isUpperCase ( char stringSymbol){
            if (stringSymbol >= 'A' && stringSymbol <= 'Z') {
                return true;
            }
            return false;
        }


        static boolean isLowerCase ( char stringSymbol){
            if (stringSymbol >= 'a' && stringSymbol <= 'z') {
                return true;
            }
            return false;
        }

        static boolean isDigit ( char stringSymbol){
            if (stringSymbol >= '0' && stringSymbol <= '9') {
                return true;
            }
            return false;
        }

        static boolean isSpecialCharacter ( char stringSymbol){
            switch (stringSymbol) {
              case'"':
              case '!':
              case '$':
              case '%':
              case '&':
              case '(':
              case ')':
              case '*':
              case '+':
              case ',':
              case '-':
              case '.':
              case '/':
              case ':':
              case ';':
              case '<':
              case '=':
              case '>':
              case '?':
              case '@':
              case '[':
              case ']':
              case '^':
              case '_':
              case '`':
              case '{':
              case '|':
              case '}':
              case '~':
              case'\\':
                  return true;
            }
            return false;
        }
    }












