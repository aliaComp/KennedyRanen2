public class Task10 {//Написать программу, копирующую последовательно элементы одного массива

    // размером 10 элементов в 2 массива размером 5 элементов каждый (задача, обратная задаче 8).
    public static void main(String[] args) {
        int[] arrayC = new int[10];
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = (int) (Math.random() * 11);
            System.out.print(arrayC[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        int counter = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (flag) {
                arrayA[counter] = arrayC[i];
            } else {
                arrayB[counter] = arrayC[i];
                counter++;
            }
            flag = !flag;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");

        }
    }
}

