import java.util.Scanner;

public class Task3 { //Write a Java program to remove duplicate characters from a given string
    // presents in another given string
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the first sentence");
        String str1 = in.nextLine();
        System.out.println("Please, enter the second sentence");
        String str2 = in.nextLine();

        char[] array1 = str1.toCharArray();
        for (int i = str1.length() - 1; i >= 0; i--) {
            for (int m = 0; m < str2.length(); m++) {
                if (str1.charAt(i) == str2.charAt(m))
                    array1 = removeArrayElement(array1, i);

                }
            }
            System.out.println(array1);
        }
        public static char[] removeArrayElement ( char[] arr, int index){
            char[] anotherArray = new char[arr.length - 1];
            for (int i = 0, k = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                anotherArray[k++] = arr[i];
            }
            return anotherArray;
        }
    }





