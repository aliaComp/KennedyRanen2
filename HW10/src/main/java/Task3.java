public class Task3 {
    public static void main(String[] args) {
        double[] array = {9, 4.5, -3.7, -6789.90, 78, -56 ,34.098, -78.2, 23, -3.00045, 987};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int value;
        int index = 0;

         for (int i = 0; i < array.length; i++) {
            value = (int) array[i];
            if (array[i] == value) {
                index = i;
                System.out.println("\nElement without fractional part " + value);
                System.out.println("index: " + index);
            }
        }
    }
}

