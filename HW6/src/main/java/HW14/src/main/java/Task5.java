import java.util.Locale;

public class Task5 {//Определить, является ли строка палиндромом.

    public static void main(String[] args) {
        String str = "Он дебил и жили бедно";
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase(Locale.ROOT);

        boolean palindrome = true;
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() -i - 1)) {
                palindrome = false;
                System.out.println("String is not palindrome");
                break;
            }
        }
        if (palindrome) {
            System.out.println("The string is palindrome");
        }
    }
}