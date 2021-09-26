public class Task9 {//Написать программу, копирующую один массив в другой следующим образом:

    // сначала копируются последовательно все элементы, большие 0,
    // затем последовательно все элементы, равные 0, а затем последовательно все элементы, меньшие 0.
    public static void main(String[] args) {
        int[] array1 = {5, 23, 12, 23, 0, 1, 3, -5, -3, 0,-1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int index = 0;
        int[] array2 = new int[11];
        for (int i = 0; i < array2.length;i++) {
            if (array1[i] > 0) {
                array2[index] = array1[i];
                index++;

            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] == 0) {
                array2[index] = array1[i];
                index++;

            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] < 0) {
                array2[index] = array1[i];
                index++;
            }

        }
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }
}
