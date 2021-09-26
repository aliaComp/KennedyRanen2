public class Task1 { //Создать массив из 20 случайных чисел в диапазоне от -30 до 10.
    // Написать программу, определяющую сумму элементов массива,
    // находящихся в массиве до первого положительного элемента.
    public static void main(String[] args) {
        int[] array = new int[20];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41) - 30;
        }

            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    break;
                }
                sum += array[i];
            }

            System.out.println(sum);

        }
    }








