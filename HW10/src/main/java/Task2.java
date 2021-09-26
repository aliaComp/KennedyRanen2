public class Task2 { // Создать массив из 20 случайных чисел.
    // Определить минимальный и максимальный элемент массива (вывести значение и порядковый номер).
    public static void main(String[] args) {
        int[] arra = new int[20];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = (int) (Math.random() * 51);
            System.out.print(arra[i] + "\t");
        }
        int max = arra[0];
        int min = arra[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arra.length; i++){
            if (arra[i] <= min) {
                min = arra[i];
                minIndex = i;
            }
            if (arra[i] >= max){
                max = arra[i];
                maxIndex = i;
            }
        }
        System.out.println("\nThe max array element is " + max +
                "\tIndex is " + maxIndex + "\nThe min array element is " + min + "\tIndex is " + minIndex);



    }

    }



